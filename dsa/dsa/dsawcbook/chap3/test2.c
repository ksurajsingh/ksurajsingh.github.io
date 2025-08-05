#include<stdio.h>
#include<stdlib.h>
#include<string.h>

void computeLPSArray(char *pat, int M,int *lps){
  int len=0;
  lps[0]=0;
  int i=1;

  while(i<M){
    if(pat[i]==pat[len]){// pattern's CHARACTER MATCH
      lps[i++]=++len;
    }
    else{ // MISMATCH
      if(len!=0){ // in any position of the pattern
        len=lps[len-1];
      }
      else{ // in FIRST position of the pattern 
        lps[i++]=0;
      }
    }
  }
}


void KMPsearch(char *pat,char *txt){
  int M=strlen(pat);
  int N=strlen(txt);

  int *lps=(int*)malloc(sizeof(int)*M);
  int j=0,i=0; // iterators for pat amd txt 
  computeLPSArray(pat,M,lps);

  while(i<N){
    if(pat[j]==txt[i]){ // Match
      i++;
      j++;
    }
    if(j==M){ // end of pattern
      printf("Found patten at index: %d",i-j+1);
      j=lps[j-1];
    }
    else if(i<N && pat[j]!=txt[i] ){ // Pure MISMATCH
      if(j!=0)
        j=lps[j-1];
      else 
        i=i+1;
    }
  }
  free(lps);
}

int main(){

  char txt[50],pat[50];

  printf("Enter the text: \n");
  fgets(txt,50,stdin);
  txt[strcspn(txt,"\n")]='\0';

  printf("Enter the pattern: \n");
  fgets(pat,50,stdin);
  pat[strcspn(pat,"\n")]='\0';

  KMPsearch(pat,txt);
  // getc();
  return 0;


}
