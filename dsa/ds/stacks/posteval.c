#include<stdio.h>
#include<string.h>
#include<math.h>
#include<stdlib.h>
#include<ctype.h> // for isdigit() , isalpha()


#define MAX 20
int s[MAX],top=0;


void push(int element){
  s[++top]=element;
}

int pop(){
  return s[top--];
}
int main(){

  char postfix[MAX],ch;
  int i,op1,op2,res;
  printf("\n\nProgram to Evaluate Posthfix Expression");
  printf("\n\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
  printf("\nEnter the postfix expression: ");
  scanf("%s",postfix);
  for(i=0;i<strlen(postfix);i++){
    ch=postfix[i];
    printf("\n char: %c",postfix[i]);
    if(isdigit(ch)){
      push(ch -'0');// this is very important as characters store anything in terms of ASCII - 
                     // and WE ONLY USE THIS PROGRAM FOR SINGLE CHARACTER CONSTANTS and hence each character is decreased by '0' ascii value,, 
                     // which makes the variable to essentially store the character as ascii value but the value itself is the integer we intend to 
    }else{
      op2=pop();
      op1=pop();
      switch(ch){
        case'+': res=op1+op2; break;
        case'-': res=op1-op2; break;
        case'*': res=op1*op2; break;
        case'/': res=op1/op2; break;
        case'^': res=pow(op1,op2); break;
        default : printf("\nInvalid Character! ");
      }
      push(res);
    }
  }
  printf("\nresult of the above expression: %d",pop());
}

