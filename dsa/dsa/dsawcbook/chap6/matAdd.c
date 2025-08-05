#include<stdio.h>

int main(){
  int a[10][10],b[10][10],i,j,n,m,x,y;

  printf("Enter the rows and columns for matrix A: ");
  scanf("%d %d",&n,&m);

  printf("Enter the rows and columns for matrix B: ");
  scanf("%d %d",&x,&y);

  if(n!=x  || m!=y){
    printf("Addition / Subtraction is not possible");
    return 0;
  }
  
  printf("\n\n\n\n Matrix 1 \n\n\n");
  for(i=0;i<n;i++){
    printf("\n\t\t\t At Row %d \n\n",i+1);
    for(j=0;j<m;j++){
    printf("Enter element %d ",j+1);
    scanf("%d",&a[i][j]);
    }
  }
  printf("\n\n\n\nMatrix 2: \n\n\n");
  for(i=0;i<x;i++){
  printf("\n\t\t\t At Row %d \n\n",i+1);
  for(j=0;j<y;j++){
    printf("Enter element %d ",j+1);
    scanf("%d",&b[i][j]);
  }
  }

  printf("\nA \t\tB \t\t Sum \t\tSub\n");
  for(i =0;i<n;i++){
  for(j=0;j<m;j++){
    printf("%d ",a[i][j]);
  }
  printf("\t\t");
  for(j=0;j<m;j++){
    printf("%d ",b[i][j]);
  }
  printf("\t\t");

  for(j=0;j<m;j++){
    printf("%d ",a[i][j]+b[i][j]);
  }
  printf("\t\t");

  for(j=0;j<m;j++){
    printf("%d ",a[i][j]-b[i][j]);
  }
  printf("\n");
  }

  return 0;

}
