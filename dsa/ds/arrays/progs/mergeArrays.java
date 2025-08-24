import java.util.Scanner;

public class mergeArrays {
  public static void main(String[] args) {
    int b[]={1,4,6,10,13};
    int a[]={2,5,7,9,16};
    int m=a.length;
    int n=b.length;
    int c[]=new int[m+n];

      int i=0,j=0,k=0;
    while(i<m && j<n){
        if(a[i]>=b[j]){
          c[k]=b[j];
          j++;
          k++;
        }
        else{
          c[k]=a[i];
          i++;
          k++;
        }
      }
    // if an array is larger than other one 
    // copy the remaining elements
    while(i<m){
      c[k]=a[i];
      i++;
      k++;
    }
    while(j<n){
      c[k]=b[j];
      j++;
      c++;
    }
    sorting.printArr(c);
    }
    
}
