#include<stdio.h>
#include<stdlib.h>

typedef struct node{
  int data;
  struct node *link;
} NODE;

NODE *last=NULL;


void display(){
  NODE *curptr=last->link;
  printf("\nUpdated list: ");
  while(curptr!=last){
    printf("%d ",curptr->data);
    curptr=curptr->link;
  }
  printf("%d",curptr->data);
  return;
}

void create(){
  char ch;
  int item;
  do{
    NODE *newnode=(NODE*)malloc(sizeof(NODE));
    printf("\nEnter the data: ");
    scanf("%d",&newnode->data);
    if(last==NULL){
      last=newnode;
      last->link=newnode;
    }else{
      newnode->link=last->link;
      last->link=newnode;
      last=newnode;
    }
    printf("\nDo you want to continue?[y/n]: ");
    scanf(" %c",&ch);
  }while(ch=='y');
  printf("\nCircular list successfully created: ");
  display();
  return;
}

int length(){
  NODE *curptr=last->link;
  int len=1;
  while(curptr!=last){
    len++;
    curptr=curptr->link;
  }
  return len;
}

void insert(){

  void ins_beg(){
  NODE *newnode=(NODE*)malloc(sizeof(NODE));
  NODE *curptr=last;
  printf("\nEnter the element to insert in the begining: ");
  // int item;
  scanf("%d",&newnode->data);
  newnode->link=curptr->link;
  curptr->link=newnode;
  display();
  return;
  }


 void ins_end(){
   NODE *newnode=(NODE*)malloc(sizeof(NODE));
  NODE *curptr=last;
  printf("\nEnter the element to insert in the end: ");
  // int item;
  scanf("%d",&newnode->data);
  newnode->link=curptr->link;
  curptr->link=newnode;
  last=newnode;
  display();
  return;
  }
  void ins_pos(){
    printf("\nEnter the position to insert the element at: ");
    int pos;
    scanf("%d",&pos);
    if(pos==1){
      ins_beg();
      return;
    }
    if(pos==length()+1){
      ins_end();
      return;
    }
    NODE *curptr=last->link;
    for(int i=0;i<pos-2;i++){
      curptr=curptr->link;
    }
    printf("\nEnter the data to insert at %d: ",pos);
    NODE *newnode=(NODE*)malloc(sizeof(NODE));
    scanf("%d",&newnode->data);
    newnode->link=curptr->link;
    curptr->link=newnode;
    display();

  }
  ins_beg();
  ins_end();
  ins_pos();
}

void delete(){

    // NODE *curptr=last->link;
  void del_beg(){
    printf("\nDeleting an element from the begining . . .");
    last->link=last->link->link;
    display();
  }
  void del_end(){
    printf("\nDeleting an element from the end . . . ");
    NODE *curptr=last->link;
    while(curptr->link!=last){
      curptr=curptr->link;
    }
    curptr->link=last->link;
    last=curptr;
    display();
  }
  void del_pos(){
    printf("\nEnter the position to delete an element from: ");
    NODE *curptr=last->link;
    int pos;
    scanf("%d",&pos);
    if(pos==1){
      del_beg();
      return;
    }
    if(pos==(length())){
      del_end();
      return;
    }
    for(int i=0;i<pos-2;i++){
      curptr=curptr->link;
    }
    curptr->link=curptr->link->link;
    display();
  }
  void del_item(){
    printf("\nEnter the data to delete: ");
    int item;
    scanf("%d",&item);
    NODE *curptr=last->link;
    while(curptr->link->data!=item){
      curptr=curptr->link;
    }
    if(curptr->link==last){
      curptr->link=curptr->link->link;
      last=curptr;
    }
    else{
      curptr->link=curptr->link->link;
    }
    display();
    return;
  }
  del_beg();
  del_end();
  del_pos();
  del_item();
  return;

}



int main(){
  create();
  printf("\nThe length is %d",length());
  // display();
  insert();
  delete();
}
