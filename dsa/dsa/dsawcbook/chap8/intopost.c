#include<stdio.h>
#include<string.h>
#include<ctype.h>
#include "revstr.h" // comment the lines from 36 to 48 in revstr.c 
                    // else there woulod be a confusion for the compiler to chose from 2 main functions for different programs 
                    // since we execute this program as ` gcc revstr.c intopost.c -o intop`

#define MAX 200

int top=1;
// char s[top]; VLA Variable Length Arrays are not allowed at the scope of a file, 
// but tihs can be used inside any functions.
// C99 and above supports VLA, the earlier don't
char s[MAX];

void push(int ch){
  s[++top]=ch;
}

char pop(){
  if(top>=0)
  return s[top--];
}

int precedence(char ch){
  switch(ch){
    case'+':
    case'-':return 1;
    case'*':
    case'/':return 2;
    case'^':return 3;
    case'(':
    default:return 0;
  }
}

void con_postfix(char postfix[],char infix[],int i,int j,char ch){
 printf("\nConverting to postfix expression: ");
  printf("\n\n\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
  for(i=0;i<strlen(infix);i++){
    ch=infix[i];
    if(isalnum(ch) ){
      postfix[j++]=ch;
    }
    else if(ch=='('){
      push(ch);
    }
    else if(ch==')'){
      while(s[top]!='('){
        postfix[j++]=pop();
      }
      pop();
    }
    else{
      while(precedence(s[top])>=precedence(ch)){
        postfix[j++]=pop();
      }
      push(ch);
    }
  }
  while(s[top]!='\0'){
    postfix[j++]=pop();
  }
  postfix[j]='\0';
  printf("\nThe equavalent postfix expression is: %s\n",postfix);

}


void con_prefix(char postfix[],char infix[],int i,int j,char ch){
 strrev(infix);
 printf("\nConverting to prefix expression: ");
  printf("\n\n\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
  for(i=0;i<strlen(infix);i++){
    ch=infix[i];
    if(isalnum(ch) ){
      postfix[j++]=ch;
    }
    else if(ch==')'){
      push(ch);
    }
    else if(ch=='('){
      while(s[top]!=')'){
        postfix[j++]=pop();
      }
      pop();
    }
    else{
      while(precedence(s[top])>=precedence(ch)){
        postfix[j++]=pop();
      }
      push(ch);
    }
  }
  while(s[top]!='\0'){
    postfix[j++]=pop();
  }
  postfix[j]='\0';
  strrev(postfix);
  printf("\nThe equavalent prefix expression is: %s\n",postfix);

}

int main(){
  char postfix[MAX],infix[MAX],ch;
  int i=0,j=0;
  printf("\nEnter the infix expression: ");
  scanf("%s",infix);
  con_postfix(postfix,infix,i,j,ch);
  con_prefix(postfix,infix,i,j,ch);
}
