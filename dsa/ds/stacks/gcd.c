#include<stdio.h>


int gcd(int n,int m){
  if(m==0){
    return n;
  }else if(n<m){
    return gcd(m,n);
  }
  else{
    return gcd(m,n%m);
  }
}

int main(){
  printf("\n Enter the number whose GCD you want to find: ");
  int n,m;
  scanf("%d%d",&n,&m);
  int result=gcd(n,m);
  printf("%d",result);
}
