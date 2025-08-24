#include<stdio.h>

int min(int arr[],int k ,int n){
  int loc=k,min=arr[k];
  for(int i=k+1;i<n;i++){
    if(arr[i]<min){
      min=arr[i];
      loc=i;
    }
  }
  return loc;
}

void printArray(int arr[],int n){
  for(int i=0;i<n;i++){
    printf("Element at %d: %d\n",i+1,arr[i]);
  }
}

void main(){
  int n;
  printf("Enter the size of the array: \n");
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++){
    printf("Enter element no %d: \n",i+1);
    scanf("%d",&arr[i]);
  }
  printf("Before sorting: \n");
  printArray(arr,n);
  printf("\t\t********** Implementing Selection sort******** \n\n ")
  int temp,loc;
  for(int i=0;i<n;i++){
    loc=min(arr,i,n);
    temp=arr[i];
    arr[i]=arr[loc];
    arr[loc]=temp;
  }
  printf("After Sorting: \n");
  printArray(arr,n);
}
