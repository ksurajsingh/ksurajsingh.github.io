#include<stdio.h>

int main(){

    float n,fact;

    printf("\n Enter the number whose factorial you want to find: ");
    scanf("%f",&n);
    fact=n;
    for(float i = (n-1) ; i>0 ; i--)
        fact=fact*i;
     printf("\n\nThe factorial of %f is %f ", n,fact );
}