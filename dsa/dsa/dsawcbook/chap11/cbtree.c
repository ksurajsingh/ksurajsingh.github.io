#include<stdio.h>
#include<math.h>

// Sequential Representation of Complete Binary Tree [ONLY]
// Meaning there are no empty nodes

int main(){
  int d,size,flag=0,n,k;
  printf("Enter the depth[height] of the tree: ");
  scanf("%d",&d);
  size=(int)pow(2,d)-1;
  int a[size];
  printf("The size of the array is: %d",size);
  printf("\nEnter the elements of tree:\n");
  for(int i=1;i<=size;i++){
    scanf("%d",&a[i]);
  }
  printf("The Tree represented as a linear array is:\n");
  for(int i=1;i<=size;i++){
    printf("%d\n",a[i]);
  }
  printf("Enter the element to search: ");
  scanf(" %d",&n);
  k=1;
  do{
    if(n==a[k]){
      flag=1;
      printf("Element found at position %d, whose parent is %d",k,a[(k)/2]);
    }
    else if(n==a[2*k]){
      flag=1;
      printf("Element found at position %d, whose parent is %d",2*k,a[k]);
    }
    else if(n==a[2*k+1]){
      flag=1;
      printf("Element found at position %d, whose parent is %d",2*k+1,a[k]);
    }
    ++k;
  }while(k<=size/2 && !flag);
  if(flag) printf("Successful Search");
  else printf("Unsuccessful Search");
  getchar();
}
