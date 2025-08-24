#include<stdio.h>
#include<stdbool.h>


bool is_prime(int n){

    bool prime;
    for (int i=2;i<(n/2);i++){
        if(n%i==0)
            prime=true;
        else    
            prime=false;
    }

    return prime;

}

int main(){

    int n;
    printf("Enter the number: ");
    scanf("%d",&n);
    if(is_prime(n))
        printf("\nPrime number");
    else
        printf("\n Composite number");
        return 0;
}