#include<stdio.h>
#include<string.h> // for gets etc 
                
int n=1000,rev_top=-1;
char revstr[1000];

void rev_push(char item){
  if(rev_top>=n){
    printf("\nOverflow condition!");
    return;
  }else{
    revstr[++rev_top]=item;
  }
}

char rev_pop(char s[]){
  if(rev_top<0){
    printf("\nStack underflow!");
    return '\0';
  }
  else{
    return revstr[rev_top--];
  }
}

void strrev(char *s){
  for(int i=0;i<strlen(s);i++){
    rev_push(s[i]);
  }
  for(int i=0;i<strlen(s);i++){
    s[i]=rev_pop(s);
  }
  printf("\nReversed String: %s",s);
}
// uncomment the following when running this program individually
// int main(){
//   int i;
//   printf("\nEnter the length of the string: ");
//   scanf("%d",&n);
//   getchar();
//
//   char s[n];
//   printf("\nEnter the string: ");
//   fgets(s,n+1,stdin);
//   s[strcspn(s,"\n")]='\0';
//   strrev(s);
// }
