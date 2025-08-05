#include<stdio.h>
#include<stdlib.h>

typedef struct node{
  int data;
  struct node *prev;
  struct node *next;
} NODE;

// linked lists are linear ds, linear ds are the ones that follow a **SEQUENCE** , where as
// non linear ds do no need a *SEQUENCE* predefined, they can have their own Sequence defined.

NODE *head=NULL;

void display(){
  NODE *curptr=head;
  printf("\nUpdated list: ");
  while(curptr!=NULL){
    printf("%d ",curptr->data);
    curptr=curptr->next;
  }
  return;
}

int length(){
  NODE *curptr=head;
  int count=0;
  while(curptr!=NULL){
    curptr=curptr->next;
    count++;
  }
  return count;
}



void insert(){
  void ins_beg(){
    NODE *curptr=head;
    NODE *newnode=(NODE*)malloc(sizeof(NODE));
    printf("\nEnter the element you want to insert at the begining: ");
    scanf("%d",&newnode->data);
    newnode->prev=NULL;
    newnode->next=curptr;
    curptr->prev=newnode;
    curptr=newnode;
    head=curptr;
    display();
  }
  void ins_end(){
    NODE *curptr=head;
    NODE *newnode=(NODE*)malloc(sizeof(NODE));
    printf("\nEnter the element you want to insert at the end: ");
    scanf("%d",&newnode->data);
    while(curptr->next!=NULL){
      curptr=curptr->next;
    }
    curptr->next=newnode;
    newnode->prev=curptr;
    newnode->next=NULL;
    display();
  }
  void ins_pos(){
    NODE *curptr=head;
    printf("\nEnter the position you want to insert element at: ");
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
    for(int i=0;i<pos-1;i++){
       curptr=curptr->next; 
    }
    printf("\nEnter the element you want to insert: ");
    NODE *newnode=(NODE*)malloc(sizeof(NODE));
    scanf("%d",&newnode->data);
    newnode->next=curptr;
    newnode->prev=curptr->prev;
    curptr->prev->next=newnode;
    curptr->prev=newnode;
    display();
  }
  ins_beg();
  ins_end();
  ins_pos();
  return ;
}

void delete(){
  void del_beg(){
    NODE *curptr=head;
    printf("\nDeleting an element from the begining . . .");
    head=curptr->next;
    display();
    return;
  }
  void del_end(){
    NODE *curptr=head;
    printf("\nDeleting an element from the ending. . .");
    while(curptr->next!=NULL){
      curptr=curptr->next;
    }
    curptr->prev->next=NULL;
    display();
    return;
  }
  void del_pos(){
    NODE *curptr=head;
    printf("\nEnter the position to delete the element from : ");
    int pos;
    scanf("%d",&pos);
    if(pos==1){
      del_beg();
      return;
    }
    if(pos==length()){
      printf("test");
      del_end();
      return;
    }
    for(int i=0;i<pos-1;i++){
      curptr=curptr->next;
    }
    curptr->prev->next=curptr->next;
    display();
  }
  del_beg();
  del_end();
  del_pos();
  return;
}

void create(){
  NODE *curptr=head;
  char ch;

  do {
    NODE *newnode=(NODE*)malloc(sizeof(NODE));
    printf("\nEnter the data you want to add: ");
    scanf("%d",&newnode->data);
    if(head==NULL){
      newnode->prev=NULL;
      newnode->next=NULL;
      curptr=newnode;
      head=curptr;
    }
    else{
      curptr->next=newnode;
      newnode->prev=curptr;
      newnode->next=NULL;
      curptr=newnode;
    }
    printf("\nDo you want to add more?[y/n]: ");
    scanf(" %c",&ch);
  } while (ch=='y');
  printf("\nDoubly linked list successfully created! ");
  display();
}

int main(){
  create();
  insert();
  delete();
}
