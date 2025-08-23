#include<stdio.h>

int main(){

    float i=0;
    printf("Enter a number: ");
    scanf("%f",&i);
    if(i>0)
        printf("\nPositive number!");
    else
        printf("\nNot Positive number");
}