#include<stdio.h>
#define MAX 5 
int q[MAX],front=0,rear=-1;

// ascending queue 
// for descending queue - just change the logic to find the largest element
// performing array implementation for the priority queue 

void qdisplay(){
  printf("\nUpdated list: ");
  for(int i=front;i<=rear;i++){
    printf("%d ",q[i]);
  }
}

void qinsert()
{
 char ch;
 do{
   if(rear==MAX-1){
     printf("\nOverflow condition! ");
     return;
   }
   int item;
   printf("\nEnter the element to be inserted: ");
   scanf("%d",&item);
   q[++rear]=item;
   printf("\nElement was successfully inserted! ");
   printf("\nDo you want to insert more?[y/n]");
   scanf(" %c",&ch);
 }while(ch=='y');
 qdisplay();
}
void qdelete(){

  char ch;
  do{
    if(rear==front-1){
      printf("\nUnderflow condition! ");
      return;
    }else if(rear==front){
      printf("\nThis is the last element in the queue");
      printf("\nThe element deleted is: %d",q[front]);
      front=0;
      rear=-1;
    }else {
    
      int min=q[0],index=0;
      for(int i=0;i<rear;i++){
        if(min>q[i+1]){
          min=q[i+1];
          index=i+1;
        }
      }
      printf("\nThe element deleted is: %d",q[index]);
    for(int i=index;i<rear;i++){
      q[i]=q[i+1];
    }
    rear--;
  }
  printf("\nElement deleted! ");
  printf("\n Do you want to delete more?[y/n]");
  scanf(" %c",&ch);
}while(ch=='y');
qdisplay();

}
 
void process_del(){

  qinsert();
  qdelete();
  qdisplay();
}

// here on this if for processing the insertion of the elements so that deletion can happen only at he front

void delete(){
  char ch;
  do{
  if(rear==front-1){
    printf("\nUnderflow condition!");
    return;
  }
  printf("\nElement deleted is: %d",q[front]);
  front++;
  printf("\nDo you want to delete another element?[y/n]");
  scanf(" %c",&ch);
  }while(ch=='y');
  qdisplay();
}

void insert(){
  char ch;
  do{
  int temp=rear;
    if(rear==MAX-1){
      printf("\nOverflow condition!");
      return;
    }
    int item;
    printf("\nEnter the item: ");
    scanf("%d",&item);
    while((temp>=0)&&(item<q[temp])){
      q[temp+1]=q[temp];
      temp--;
    }
    q[temp+1]=item;
    rear++;
  qdisplay();
    printf("\nElement inserted!\nDo you want to insert more?[y/n]");
    scanf(" %c",&ch);
  }while(ch=='y');
}

void process_ins(){
  insert();
  delete();
  qdisplay();
}

int main(){
  printf("\n****Using Simple Linear Array****");
  printf("\nSorting while deletion: ");
  process_del();
  printf("\nSorting while insertion: ");
  process_ins();
}
