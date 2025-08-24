#include<stdio.h>
#include<stdlib.h>

#define N 5 

int queue[3][N];

int front[3]={0,0,0};
int rear[3]={-1,-1,-1};
int item,pr;


void display(){
  printf("\nDisplaying!!\n");
  int i,j;
    for(i=0;i<3;i++){
      if(rear[i]==front[i]-1){
        printf("\nNo elements in Queue %d",i+1);
      }
      else{
        printf("\nQueue %d",i+1);
        for(j=front[i];j<=rear[i];j++){
          printf("\n\t%d",queue[i][j]);
        }
        printf("\nFront of the queue is %d",queue[i][front[i]]);
        printf("\nRear of the queue is %d",queue[i][rear[i]]);
      }
    }
      return;
}


void insert(int pr){
  printf("\nInserting!!\n");
  if(rear[pr]==N-1){
    printf("\nQueue Overflow");
    return;
  }
  else{
    printf("\nEnter the item: ");
    scanf("%d",&item);
    rear[pr]++;
    queue[pr][rear[pr]]=item;
    display();
    return;
  }
}

void delete(){
  printf("\nDeleting!!\n");
  int i;
  for(i=0;i<3;i++){
    if(rear[i]==front[i]-1){
      printf("\nQueue %d has a underflow condition! ",i+1);
    }
    else{
      printf("\nFrom queue %d \n Delete item %d",i+1,queue[i][front[i]]);
      front[i]++;
      display();
      return;
    }
  }
}



void main(){
  int ch;
  while(1){
    printf("\n\t Priority Queue Implementation using Multi-Queue! [2dArrays] ");
    printf("\n*****************************************************************\n");
    printf("\n1.Insert\t2.Delete\t3.Display\t4.Exit\nEnter your choice: ");
    scanf("%d",&ch);
    switch(ch){
      case 1:printf("Enter the priority number: ");
             scanf("%d",&pr);
             if(pr>0&&pr<4)
               insert(pr-1);
             else 
              printf("Only 3 Priority exists - 1,2,3");
              break;
      case 2:delete();
             break;
      case 3:display();
             break;
      case 4:exit(0);
    }
  
  }
}
