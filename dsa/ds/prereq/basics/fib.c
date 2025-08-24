#include<stdio.h>

int main(){

    int fib[100];
    fib[0]=0;
    fib[1]=1;
    fib[2]=1;
    int n;
    printf("Enter the number fibonacci indexes you want to find: ");
    scanf("%d",&n);
    int y;
    printf("\n Enter the numer that you want to check: ");
    scanf("%d",&y);
    for(int i=3;i<=n;i++)
        fib[i]=fib[i-1]+fib[i-2];
    
    for(int i=0;i<=n;i++){
        if(y==fib[i])
            printf("\nFound at index: %d\n",i+1);
        printf("%d ",fib[i]);
    }




}