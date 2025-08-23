#include<stdio.h>

#define MAX 3

// this code is not upto the mark , but does a little work [doesn't handle all edge cases]
int q[MAX],front=0,rear=-1;

void display(){
  printf("\nUpdated list: ");
  for(int i=front;i<= rear;i++){
    printf("%d ",q[i]);
  }
}

void insert(){
    char ch;
  do{
  if(rear==MAX-1){
    printf("\nOverflow condition!");
    return;
  }
    printf("\nEnter the element to be inserted: ");
    int item;
    scanf("%d",&item);
    q[++rear]=item;// array bounds aren't checked at runtime!
                   // therefore you can keep inserting more than MAX elements 
                   // but it might crash later on
    printf("\nElement is successfully inserted!");
    printf("\nDo you want to insert more?[y/n]: ");
    scanf(" %c",&ch);
  }while(ch=='y');
  display();
}


void delete(){
    char ch;
  do{
  if(rear==front-1){
    printf("\nUnderflow condition!");
    return;
  }
    front++;
    printf("\nElement deleted!");
    printf("\nDo you want to delete another element?[y/n]");
    scanf(" %c",&ch);
  }while(ch=='y');
  display();
}

int main(){
  insert();
  delete();
  display();
}
