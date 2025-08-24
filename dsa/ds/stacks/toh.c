#include<stdio.h>

// only one disk can move at a time, from one pillar to another. 
// A larger disk cannot be placed on a smaller disk
// Only the top disc on any pillar may be moved to any other pillar.

int count=0;

void toh(int n,char s,char t,char d){
  if (n>0){
    toh(n-1,s,d,t);
    printf("\n Move disk %d %c->%c \n",n,s,d);
    toh(n-1,t,s,d);
  }
}

int main(){
  printf("\nEnter the number of discs: ");
  int n;
  char source='S',temp='T',destination='D';
  scanf("%d",&n);
  printf("\n Sequence is: ");
  toh(n,source,temp,destination);
}
