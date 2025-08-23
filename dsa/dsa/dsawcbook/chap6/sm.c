#include<stdio.h>

int main(){
  int i,s,j,count=0,n,m;
  printf("Enter the order of the matrix: \n");
  scanf("%d %d",&n,&m);

  int arr[n][m];
  int sm[n][m];
  int tm[n][m];
  for(i=0;i<n;i++){
    printf("\n\n **** IN ROW %d **** \n\n",i+1);
    for(j=0;j<m;j++){
      printf("Enter element no %d: \n",j+1);
      scanf("%d",&arr[i][j]);
      if(arr[i][j]==0){
        count++;
      }
    }
  }

  if (count>((n*m)/2)){
    printf("This is a sparse matrix! ");
    for(i=0;i<n;i++){
      for(j=0;j<m;j++){
        if(arr[i][j]!=0){
          sm[s][0]=i;
          sm[s][1]=j;
          sm[s][2]=arr[i][j];
          tm[s][0]=j;
          tm[s][1]=i;
          tm[s][2]=arr[i][j];
          s++;
        }
      }
    }
    printf("\n\nThe non - zero Entries [a.k.a: sparse matrix] are: \n");
    for(i=0;i<s;i++){
      for(j=0;j<3;j++){
        printf("%d ",sm[i][j]);
      }
      printf("\n");
    }

    printf("\n\n The Transpose matrix is: \n");
    for(i=0;i<s;i++){
      for(j=0;j<3;j++){
        printf("%d ",tm[i][j]);
      }
      printf("\n");
    }
  }
  else{
    printf("This is not a sparse matrix! ");
  }
  return 0;
}
