#include<stdio.h>

void insertionSort(int arr[],int n){
  printf("\t\t********** Implementing Insertion sort******** \n\n ")
  int k,j;
  for(int i=1;i<n;i++){
    k=arr[i];
    for(j=i-1;j>=0 && arr[j]>k ; j--){
      arr[j+1]=arr[j];
    }
    arr[j+1]=k;
  }
}

void printArray(int arr[],int n){
  for(int i=0;i<n;i++){
    printf("The element at %d : %d \n",i+1,arr[i]);
  }
}

void main(){
  int n; 
  printf("Enter the size of the array: \n");
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++){
    printf("Enter the element at %d: ",i+1);
    scanf("%d",&arr[i]);
    
  }
  printf("\n\nBefore sorting:  \n");
  printArray(arr,n);
  insertionSort(arr,n);
  printf("\n\n After sorting: \n");
  printArray(arr,n);
}
