#include<stdio.h>

void printArray(int arr[],int n){
  for(int i=0;i<n;i++){
    printf("Element no: %d : %d \n",i+1,arr[i]);
  }
}


void delete(int arr[],int *n){
  int pos;
  printf("Enter the position: \n");
  scanf("%d",&pos);
 int i; 
  for(i=pos-1;i<*n;i++){
    arr[i]=arr[i+1];
  }
  (*n)--;
  printArray(arr,*n);
}

void insert(int arr[],int *n){
  int pos,e;
  printf("Enter the position to inssert element: \n");
  scanf("%d",&pos);
  printf("Enter the element to insert: \n");
  scanf("%d",&e);
  (*n)++;
  for(int i=*n;i>=pos;i--){
    arr[i]=arr[i-1];
  }
  arr[pos-1]=e;
  printArray(arr,*n);
}

int main(){
  int n;
  printf("Enter the size of the array: \n");
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++){
    printf("Enter the element no: %d \n",i+1);
    scanf("%d",&arr[i]);
  }
  printArray(arr,n);
  insert(arr,&n);
  delete(arr,&n);


}
