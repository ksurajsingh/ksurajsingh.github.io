#include<stdio.h>

void faci(){
  printf("\nEnter the range: ");
  int n;
  scanf("%d",&n);
  int arr[n];
  arr[0]=1;
  for(int i=1;i<n;i++){
    arr[i]=(i+1)*arr[i-1];
  }
  for(int i=0;i<n;i++){
    printf("%d ",arr[i]);
  }
}

int facr(int n){
  if(n==0){
    return 1;
  }
  return (n*facr(n-1));
}

int main(){
  printf("\nImpleting factorial using iterations! \n");
  faci();
  printf("\nImpleting factorial using recursion! \n");
  int res;
  printf("\nEnter the range: ");
  int n;
  scanf("%d",&n);
  int i=1;
  while(i<=n){
    printf("%d ",facr(i));
    i++;
  }
}
