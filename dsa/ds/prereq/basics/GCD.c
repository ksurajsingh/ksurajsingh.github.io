#include<stdio.h>

int GCD(int n,int m){

    if(n==0)
        return m;
    return GCD(m%n,n);
}


int main(){

    int n,m,gcd;
    printf("Enter the first number: ");
    scanf("%d",&n);
    printf("Enter the second number: ");
    scanf("%d",&m);

    gcd=GCD(n,m);
    printf("The GCD is given numbers are: %d",gcd);
    
}