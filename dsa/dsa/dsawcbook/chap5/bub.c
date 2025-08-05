#include<stdio.h>

void printArray(int arr[], int*n){
  for(int i=0;i<*n;i++){
    printf("Element at %d : %d \n",i+1,arr[i]);
  }
}

void bubSort(int arr[],int *n){
  printf("\t\t********** Implementing Bubble sort******** \n\n ")
  int temp;
  for(int i=0;i<*n;i++){
    for(int j=0;j<*n-i;j++){
      if(arr[j]>arr[j+1]){
        temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
      }
    }
  }
}

void main(){
  int n;
  printf("Enter the size of the array: \n");
  scanf("%d",&n);
  int arr[n];

  for(int i=0;i<n;i++){
    printf("Enter array elements: \n");
    scanf("%d",&arr[i]);
  }
  printf("Before sorting: \n");
  printArray(arr,&n);
  bubSort(arr,&n);
  printf("after sorting: \n");
  printArray(arr,&n);

}

