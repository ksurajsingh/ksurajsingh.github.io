#include<stdio.h>
#include<stdlib.h>

typedef struct Node{
    int data;
    struct Node *link;
} NODE ;

NODE *head=NULL;

void create(){
  // creates a linked list with sinlge node 
  // without knowing its length
head=(NODE*)malloc(sizeof(NODE));
  char ch;
  NODE *curptr,*newnode;
  curptr=head;
 while(1){
    printf("Enter the node data: ");
    scanf("%d",&curptr->data);
    printf("\nThe given data is: %d",curptr->data);
    printf("\nDo you want to add one more node?[y/n]: ");
    scanf(" %c",&ch);
    if(ch=='y'){
      newnode=(NODE*)malloc(sizeof(NODE));
      curptr->link=newnode;
      curptr=newnode;
    }
    else{
      printf("Linked list has been successfully created! ");
      curptr->link=NULL;
      break;
    }
  }
}
void    display(){
  // displays the entire linked list
  printf("\nThe elements in the linked list are: ");
  NODE *curptr=head;
  while(curptr!=NULL){
    printf("%d ",curptr->data);
    curptr=curptr->link;
  }
}
void    length(){
  // prints the length of the current list
  printf("\nThe length of the liked list is: ");
  int count=0;
  NODE *curptr=head;
  while(curptr!=NULL){
    curptr=curptr->link;
    count++;
  }
  printf("%d",count);

}
void    search(){
  // searches a particular item to return its position
  printf("\nEnter the element to search: ");
  int item;
  scanf("%d",&item);
  int pos=0;
  NODE *curptr=head;
  while(curptr->data!=item){
    curptr=curptr->link;
    pos++;
  }
  if(curptr->data==item){
    printf("\nElement %d found at position %d",item,pos+1);
    return;
  }
  else{
    printf("\n Element not found!");
  }
}
void    insBegin(){
  // inserts the given item to the begining of the linked list
  NODE *curptr=head;
  NODE *newnode=(NODE*)malloc(sizeof(NODE));
  printf("\nEnter the element you want to insert at the begining: ");
  int item;
  scanf("%d",&item);
  newnode->data=item;
  newnode->link=curptr;
  head=newnode;
  printf("\n updated list: \n");
  display();
}
void    insEnd(){
  // inserts the given element at the end of the linked list
  NODE *curptr=head;
  NODE *newnode=(NODE*)malloc(sizeof(NODE));
  printf("\nEnter the element you want to insert at the end: ");
  int item;
  scanf("%d",&item);
  newnode->data=item;
  while(curptr->link!=NULL){
    curptr=curptr->link;
  }
  curptr->link=newnode;
  newnode->link=NULL;
  printf("\n Updated list: ");
  display();

}
void    insPos(){
  // inserts the given element at the given position
  printf("\n Enter the position to insert the element at: ");
  int pos;
  scanf("%d",&pos);
  if(pos==1){
    insBegin();
    return;
  }
  NODE *curptr=head;
  NODE *newnode=(NODE*)malloc(sizeof(NODE));
  for(int i=0;i<pos-2;i++){
    curptr=curptr->link;
  }
  printf("\nEnter the element you want to insert at the end: ");
  int item;
  scanf("%d",&item);
  newnode->data=item;
  newnode->link=curptr->link;
  curptr->link=newnode;
  printf("\nUpdates list is: ");
  display();
  return;
}
void    insSorted(){
 // check this at the end , once everything else works
}
void    delBegin(){
 // delete an element from the begining of the linked list
 NODE *curptr;
 curptr=head;// I explicitly did this just to bring it to your notice that a pointer when declared as 
             // <Datatype> *ptr=var; is same as 
             // <datatype> *ptr; 
             // ptr=var; 
             // since in both places a address vfalue that id of the type <datatype> * in passed and is stored in the 
             // ptr which is of the type <datatype> *
 curptr=curptr->link;
 head=curptr;
 printf("\nAfter deleting an element from begining \nThe updates list: ");
 display();

}
void    delEnd(){ 
 // delete an element from the end of the linked list
 NODE *curptr=head;
 while(curptr->link->link!=NULL){
   curptr=curptr->link;
 }
 curptr->link=NULL;
 printf("\nAfter deleting an element from end\nThe updates list: ");
 display();
}
void    delItem(){
 // delete an element from the given position
  printf("\nEnter the element to delete: ");
  int item;
  scanf("%d",&item);
  int pos=0;
  NODE *curptr=head;
  if(curptr->data==item){
    delBegin();
    return;
  }
  while(curptr->link->data!=item){
    curptr=curptr->link;
    pos++;
  }
  if(curptr->link->data==item){
    printf("\nElement %d found at position %d",item,pos+2);
  }
  else{
    printf("\n Element not found!");
    return; 
  }
  curptr->link=curptr->link->link;
 printf("\nAfter deleting an element from %d\nThe updates list: ",pos+2);
 display();

}
void    delPos(){
 // delete the given item from linked list
 printf("\nEnter to position to delete the element from: ");
 int pos;
 scanf("%d",&pos);
 NODE *curptr=head;
 if(pos==1){
   delBegin();
   return;
 }
 for(int i=0;i<pos-2;i++){
   curptr=curptr->link;
 }
  printf("\nElement at pos %d is: %d\nDeleting it! ",pos,curptr->link->data);
 curptr=curptr->link->link;

 printf("\nAfter deleting an element from pos %d\nThe updates list: ",pos);
 display();

}


int main(){
    create();
    display();
    length();
    search();
    insBegin();
    insEnd();
    insPos();
    // insSorted();
    delBegin();
    delEnd();
    delPos();
    delItem();
 
    return 0;
}
