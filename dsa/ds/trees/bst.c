#include<stdio.h>
#include<stdlib.h>
#include<time.h>

typedef struct node{
  int info;
  struct node *left ;
  struct node *right;
} NODE ;

int get_rand_int(){
  return rand()%2;
}

NODE *root=NULL;

NODE *new_node(int x){
  NODE *n=(NODE*)malloc(sizeof(NODE));
  if(!n){ perror("malloc");exit(1);}
  n->info=x;n->left=NULL;n->right=NULL;
  return n;
}

NODE *insert(int item,NODE *cur,NODE* n){
  if(cur==NULL) return n;
  if(item < cur->info)      cur->left = insert(item,cur->left,n);
  else if(item > cur->info)  cur->right = insert(item,cur->right,n);
  else{
    if(get_rand_int())      cur->left = insert(item,cur->left,n);
    else                    cur->right = insert(item, cur->right,n);
  }
  return cur;
}


NODE* search(NODE *cur,int item){
  if(cur==NULL) return NULL;
  if(cur->info==item) return cur;
   return (item < cur->info )?search(cur->left,item):search(cur->right, item);
}

NODE* search_parent(NODE* child,NODE* cur){
  if(!child || !cur || child==root) return NULL;
  while(cur){
  if(cur->right==child || cur->left==child) return cur;
      cur = (child->info < cur->info) ? cur->left : cur->right;
  }
  return NULL;
}


NODE* inorder_successor(int item){
  NODE* cur=search(root,item);
  if(!cur) return NULL;

  if(cur->right){
    NODE* s=cur->right;
    while(s->left) s = s->left;
    return s;
  }

  NODE *suc = NULL, *anc=root;
  while(anc && anc != cur){
    if(cur->info < anc->info){ suc=anc; anc=anc->left; }
    else                     { anc=anc->right;}
  }
  return suc;
}

void delete_case1(NODE *del){
  NODE* p=search_parent(del,root);
  if(!p){
    root=NULL;
  }
  else if(p->left==del){
    p->left=NULL;
  }else{
    p->right=NULL;
  }
  free(del);
}

void delete_case2(NODE *del){
  NODE *child= del->left?del->left:del->right;
  NODE* p=search_parent(del,root);
  if(!p){
    root=child;
  }
  else if(p->left==del){
    p->left=child;
  }else{
    p->right=child;
  }
  free(del);
}

void delete_node(int item);

void delete_case3(NODE* del){
  NODE* suc=inorder_successor(del->info);
  int ptr=suc->info;
  delete_node(suc->info);
    del->info=ptr;
}

void delete_node(int item){
  NODE* node=search(root,item);
  if(!node) return;
  if(!node->left && !node->right)     delete_case1(node);
  else if(!node->left|| !node->right) delete_case2(node);
  else                                delete_case3(node);
}



void display_level_tilt(NODE* root,int level){
  if(!root) return ;
  display_level_tilt(root->right,level+1);
  for(int i=0;i<level;i++) printf("  ");
  printf("%d\n",root->info);
  display_level_tilt(root->left,level+1);
  }
  


// [EXPERIMENTAL] Add no duplicated while construction


int main(){
  srand(time(0));
  int ch,item,key;
  NODE* add;
  printf("\n\n*****Implementing a Binary Seach Tree*****\n\n");
  while(true){

    printf("\n*********************************\nEnter your choice:\n1.Create\n2.Search\n3.Inorder Successor\n4.Delete\n5.Display\n6.Exit");
    scanf("%d",&ch);
    switch(ch){
      case 1: printf("\n ** Enter the value of the node: ");
              scanf(" %d",&item);
              root=insert(item,root,new_node(item));
              break;
      case 2:printf("\nEnter the element to search: ");
             scanf(" %d",&key);
             add=search(root,key);
             if(add) printf("Key found at: %d",add);
             else    printf("Key not found.\n",key);
             break;
      case 3:printf("\nEnter the element whose inorder successor you want: ");
             scanf("%d",&item);
             NODE* res=inorder_successor(item);
             if(res) printf("Inorder success is: %d",res->info);
             else    printf("No Inorder Successor found.\n The element is the max. Or the successor might be deleted.");
             break;
      case 4:printf("\nEnter the element you want to delete: ");
             scanf("%d",&item);
             delete_node(item);
             printf("element deleted");
             printf("\nCurrent elements are:\n");
             display_level_tilt(root,1);
             break;
      case 5:printf("\nCurrent elements are:\n");
             display_level_tilt(root,1);
             break;
      case 6:exit(0);
      default: return 0;
    }

  }
  return 0;
}
