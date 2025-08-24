#include<stdio.h>

int main(){

        int n,even=0;
        printf("\nEnter the number: ");
        scanf("%d",&n);
        for(int i=0;i<=n;i++){
            if(i%2==0){
                printf("\n%d",i);
                even=even+i;
                if(i==n)
                    even=even-i;
            }
            
        }
        printf("\n%d",even);
}