#include<stdio.h>

int main(){

    float a,b,c;
    printf("Enter the first number: ");
    scanf("%f",&a);
    printf("Enter the second number: ");
    scanf("%f",&b);
    printf("Enter the third number: ");
    scanf("%f",&c);
    float avg= (a+b+c)/3;
    printf("The average of 3 numbers is: %f",avg);
}