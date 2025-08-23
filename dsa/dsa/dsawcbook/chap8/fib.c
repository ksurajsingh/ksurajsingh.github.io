#include<stdio.h>

void fibi(){
  int n;
  printf("\nEnter the range: ");
  scanf("%d",&n);
  int arr[n];
  arr[0]=0;
  arr[1]=1;
  for(int i=2;i<=n;i++){
    arr[i]=arr[i-1]+arr[i-2];
  }
  for(int i=0;i<n;i++){
    printf("%d ",arr[i]);
  }
  return;
}

int fibr(int n){
  if (n==0)
    return 0;
  if (n==1)
    return 1;
  return (fibr(n-2)+fibr(n-1));
}

int main(){
  printf("\n\n Calling fibonacci iterative! \n");
  fibi();
  int n;
  printf("\n\n Calling fibonacci recursive! \n");
  printf("\nEnter the range: ");
  scanf("%d",&n);
  int i=1;
  while(i<=n){ 
    printf("%d ",fibr(i-1));
    i++;
  }
}
