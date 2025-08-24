#include<stdio.h>

int n,top=-1;
int s[];

void  display(){
  printf("\nUpdated Stack:\n");
  for(int i=top;i>=0;i--){
    if(i==top){
      printf("%d -- top\n",s[i]);
    }else{
    printf("%d\n",s[i]);
    }
  }

}

void push(){
  if(top>=n-1){
    printf("\nOverflow condition!");
    return;
  }else{
    int item;
    printf("\nEnter the item to be inserted: ");
    scanf("%d",&item);
    s[++top]=item;
  }
  display();
}


void create(){
  printf("\nEnter the size of the stack: ");
  scanf("%d",&n);
  char ch='y';
  while(1){
  if(ch=='y'){
     if(top>=n-1){
      printf("\n Overflow Condition! ");
      display();
      return;
    }
    push();
    printf("\nDo you want to enter the data?[y/n]: ");
    scanf(" %c",&ch);
  }else{
    display();
    return;
  }
  }

}



void  pop(){
  printf("\n\nPerforming pop operation!\n");
  printf("\nPopped element is: %d",s[top--]);
}

void  length(){
  printf("\n The length of the stack right now is :%d",top+1);
}

int main(){
  create();
  printf("\n\nPerforming push operation!\n");
  push();
  pop();
  display();
  length();

}
