#include<stdio.h>

#define n 5

void rev_arr(int arr[]){
  int temp;
  for(int i=0;i<n/2;i++){
    temp=arr[n-i-1];
    arr[n-i-1]=arr[i];
    arr[i]=temp;
  }
}

int main(){
  int arr[n];
  for (int i=0;i<n;i++){
    printf("Enter %d element: ",i+1);
    scanf("%d",&arr[i]);
  }
  rev_arr(arr);
  printf("Reversed array is: ");
  for(int i=0;i<n;i++){
    printf("%d ",arr[i]);
  }
}
