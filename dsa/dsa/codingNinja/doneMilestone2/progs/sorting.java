import java.util.Scanner;

public class sorting {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[]={1,3,0,4,2,6};

    printArr(arr);
    insSort(arr);
    printArr(arr);
    
  }

  public static void printArr(int[] arr) {
    
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    
  }
  public static void insSort(int arr[]) {
    int n=arr.length;
    for(int i=1;i<n;i++){

      int j=i-1;
      int temp = arr[i];
      while(j>=0 && arr[j]>temp){
          arr[j+1]=arr[j];
          j--;
      }
      arr[j+1]=temp;
    }
    
  }
  public static void selSort(int[] arr) {
    int n= arr.length;
    for(int i=0;i<n;i++){
    int min = Integer.MAX_VALUE,minIndex=-1;
      minIndex=i;
      for (int j=i;j<n;j++){
        if(arr[j]<min){
          min=arr[j];
          minIndex=j;
        }
      }
      
      int temp = arr[i];
      arr[i]=arr[minIndex];
      arr[minIndex]=temp;
    }
    
    
  }

  public static void bubSort(int arr[]) {
    int n =arr.length;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]>arr[j])
        {
          int temp = arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
  }
}
