#include<stdio.h>

int main(){

        int a,b,c;
        printf("\nEnter the first side: ");
        scanf("%d",&a);
        printf("\nEnter the second side: ");
        scanf("%d",&b);
        printf("\nEnter the third side: ");
        scanf("%d",&c);
        if(a==b || a==c || b==c ){
            if(a==c && b==c)    
                printf("\n1");
            else
                printf("\n0");

        }
        else 
            printf("\n-1");
}