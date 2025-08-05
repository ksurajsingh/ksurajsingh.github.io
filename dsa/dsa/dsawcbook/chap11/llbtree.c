#include<stdio.h>
#include<stdlib.h>
#include<math.h>

struct node{
  int info;
  struct node *left;
  struct node *right;
}; 

// This 'typedef' struct declaration can be written anywhere in the file.

typedef struct node NODE;


NODE* getNode(){
  NODE *n=(NODE*)malloc(sizeof(NODE));
  n->left=NULL;
  n->right=NULL;
  return n;
}


void create_tree(NODE *ptr){
  int item;
  char ch;
  if(ptr){
    printf("Enter item to be inserted: ");
    scanf("%d",&item);
    ptr->info=item;
  }
  printf("Do you want a left child?[Y/N]: ");
  scanf(" %c",&ch);
  if(ch=='Y'||ch=='y'){
    NODE *newleft=getNode();
    ptr->left=newleft;
    create_tree(newleft);
  }
  printf("Do you want a right child?[Y/N]: ");
  scanf(" %c",&ch);
  if(ch=='Y'||ch=='y'){
    NODE *newright=getNode();
    ptr->right=newright;
    create_tree(newright);
  }
}

void preorder_traversal(NODE *ptr){
  if(ptr){
    printf("%d ",ptr->info);
    preorder_traversal(ptr->left);
    preorder_traversal(ptr->right);
  }
}

void postorder_traversal(NODE *ptr){
  if(ptr){
    postorder_traversal(ptr->left);
    postorder_traversal(ptr->right);
    printf("%d ",ptr->info);
  }
}

void inorder_traversal(NODE *ptr){
  if(ptr){
    inorder_traversal(ptr->left);
    printf("%d ",ptr->info);
    inorder_traversal(ptr->right);
  }
}

// sequential print
void print_level_order(NODE *ptr){
  printf("\nImplementing level-order traversal\n");
  NODE *queue[100]; // we use queue and not array as queue has two pointer. 
                    // Array would consume more space in maintaining -1s
  int rear=0,front=0;
  queue[rear++]=ptr;
  while(front<rear){
    NODE *cur=queue[front++];
    printf("%d ",cur->info);
    if(cur->left){
      queue[rear++]=cur->left;
    }
    if(cur->right){
      queue[rear++]=cur->right;
    }
  }
}

int main(){
  NODE *root=getNode();
  create_tree(root);
  printf("\nImplementing Pre-order traversal\n");
  preorder_traversal(root);
  printf("\nImplementing In-order traversal\n");
  inorder_traversal(root);
  printf("\nImplementing Post-order traversal\n");
  postorder_traversal(root);
  print_level_order(root);
}
