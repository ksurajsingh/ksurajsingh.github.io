#include<stdio.h>
#include<math.h>
int size,a[50];

// Sequential Representation of btree 
// Can have empty nodes

void create_tree(int i){
  int item=0;
  char ch;
  if(i==0||i>size){
    return;
  }
    printf("Enter the item to be inserted at node %d: ",i);
    scanf("%d",&item);
  a[i]=item;
  printf("Do you want to insert a left-child of node %d?[y/n]: ",a[i]);
  scanf(" %c",&ch);
  if(ch=='Y'||ch=='y'){
    create_tree(2*i);
  }
  printf("Do you want to insert a right-child of node %d?[y/n]: ",a[i]);
  scanf(" %c",&ch);
  if(ch=='Y'||ch=='y'){
    create_tree(2*i+1);
  }
}

int main(){
  int d;
  printf("Enter the depth: ");
  scanf("%d",&d);
  size=(int)pow(2,d)-1;
  printf("The size of the array is: %d\n",size);
  for(int i=1;i<=size;i++){
    a[i]=-1;
  }
  create_tree(1);
  printf("\nThe elements in the list: ");
  for(int i=1;i<=size;i++){
    printf("%d ",a[i]);
  }
}

