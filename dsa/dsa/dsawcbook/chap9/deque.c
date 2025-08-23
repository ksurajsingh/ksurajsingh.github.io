#include<stdio.h>
#include<stdlib.h>

#define N 5 
int queue[N],front=-1,rear=-1,choice,item;

void insert_front(){
  printf("\nInserting at front");
  int item;
  if(front==(rear+1)%N){
    printf("\nQueue overflow");
    return;
  }
  printf("\nEnter the data: ");
  scanf("%d",&item);
  if(front==-1){
    front=rear=0;
  }
  else if(front==0){
    front=N-1;
  }
  else{
    front=(front-1+N)%N;
  }
  queue[front]=item;
  return;
}

void insert_rear(){
  printf("\nInserting at rear");
  int item;
  if(front==(rear+1)%N){
    printf("\nQueue overflow");
    return;
  }
  printf("\nEnter the data: ");
  scanf("%d",&item);
  if(front==-1)
    front=rear=0;
  else 
    rear=(rear+1)%N;
  queue[rear]=item;
}

void delete_front(){
  if(front==-1){
    printf("\nQueue Underflow!");
    return;
  }
  item=queue[front];
  printf("\nThe deleted item is: %d",queue[front]);
  queue[front]=0;
  if(front==rear)
    front=rear=-1;
  else
    front=(front+1)%N;
  return;
}

void delete_rear(){
  if(front==-1){
    printf("\nQueue Underflow");
    return;
  }
  item=queue[rear];
  printf("\nDeleted element is: %d",queue[rear]);
  queue[rear]=0;
  if(front==rear)
    front=rear=-1;
  if(rear==0)
    rear=N-1;
  else
    rear=(rear-1)%N;
  return;
}

void display(){
  int i;
  if(front==-1){
    printf("\nQueue is empty!");
    return;
  }
  if(front<=rear){
  for(i=front;i<=rear;i++){
    printf("\t%d",queue[i]);
  }
  }
  if(front>rear){
    for(i=front;i<N;i++){
      printf("\t%d",queue[i]);
    }
    for(i=0;i<=rear;i++){
      printf("\n%d",queue[i]);
    }
  }
  printf("\n\tFront of the queue is %d",queue[front]);
  printf("\n\tRear of the queue is %d",queue[rear]);
  return;
}


void input_res(){
  int ch;
  while(1){
    printf("\n\tUsing Input Restricted Deque");
    printf("\n\t******************************");
    printf("\n\t1.Insert\t2.Delete from Front\t3.Delete from Rear\t4.Display\t5.Exit\nEnter your choice: ");
    scanf("%d",&ch);
    switch(ch){
      case 1:insert_rear();
             break;
      case 2:delete_front();
             break;
      case 3:delete_rear();
             break;
      case 4:display();
             break;
      default:exit(0);
    }
  }
  return;
}

void output_res(){
  int ch;
  while(1){
    printf("\n\tUsing Output Restricted Deque");
    printf("\n\t*******************************");
    printf("\n\t1.Insert from front\t2.Insert from rear\t3.Delete\t4.Display\t5.Exit\nEnter your choice: ");
    scanf("%d",&ch);
    switch(ch){
      case 1:insert_front();
             break;
      case 2:insert_rear();
             break;
      case 3:delete_front();
             break;
      case 4:display();
             break;
      default:exit(0);
    }
  }
  return;
}



void main(){
  int ch;
  while(1){
    printf("\n\tImplementing Deque using Array\n"); 
    printf("\n*****************************************************************\n");
    printf("\n1.Input restricted Deque \t2.Output restricted Deque \nEnter your choice: ");
    scanf("%d",&ch);
    switch(ch){
      case 1:input_res();
              break;
      case 2:output_res();
             break;
      case 3:
      default:exit(0);
  }
  return;
}
}
