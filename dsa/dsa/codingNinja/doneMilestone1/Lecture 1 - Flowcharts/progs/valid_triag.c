#include<stdio.h>

int main(){

    float a,b,c;
    printf("Enter the first side: ");
    scanf("%f",&a);
    printf("\nEnter the second side: ");
    scanf("%f",&b);
    printf("\nEnter the third side: ");
    scanf("%f",&c);
    if(a+b>=c && a+c>=b && b+c>=a)
        printf("\nIs valid");
    else
        printf("\n Invalid");
}