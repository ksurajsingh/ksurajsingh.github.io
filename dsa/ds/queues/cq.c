#include<stdio.h>

#define MAX 3 

int q[MAX],front=-1,rear=1;

void display(){
  if(front=-1){
    printf("Empty");
  }else if(front<=rear){
    for(int i=front;i<=rear;i++){
      printf("%d ",q[i]);
    }
  }
  else{
    for(int i=front;i<MAX;i++){
      printf("%d ",q[i]);
    }
    for(int i=0;i<=rear;i++){
      printf("%d ",q[i]);
    }
  }
}

void insert(){
  int item;
  if((front==0 && rear==MAX-1) || rear == front-1){
    printf("\nOverflow Condition!");
    return;
  }
  rear=((rear+1)%MAX);
  printf("\nEnter the element to insert");
  q[rear]=item;
  display();
}

void delete(){
  if(front=-1){
    printf("\nUnderflow Condition!");
  }
  printf("\nDeleted element is: %d",q[front]);
  if(front==rear){
    front=rear=-1;
  }else{
    front=((front+1)%MAX);
  }
  display();
}

int main(){
  char ch;
  printf("\nImplemting Circular Queue!");
  while(1){
    printf("\nEnter choice\n1.Insert\t2.Delete\t3.Display\t4.Exit");
    scanf(" %c",&ch);
    switch(ch){
      case'1':insert();break;
      case'2':delete();break;
      case'3':display();break;
      case'4':return 0;
      default:printf("\nInvalid Option!");
    }
  }
}
