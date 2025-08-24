package doneMilestone2.progs;

import java.util.Scanner;

public class arrays {
  public static void main(String[] args) {
    //test()
    //findLargestElement(arr);
    int arr[]=takeArrInput();
    

    printAllPairs(arr);

  }
  public static void printAllPairs(int arr[]) {
        for(int i=0;i<arr.length-1;i++){// the last element is already paired
          for(int j=i+1;j<arr.length;j++){  
            System.out.printf("\nPair %d: %d,%d",(i+j),arr[i],arr[j]);
          }
        }
  }

  public static int[] takeArrInput() {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size: ");
    int n =sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      System.out.printf("\nEnter value %d: ",(i+1));
      arr[i]=sc.nextInt();
    }
   return arr; 
  }

  public static  void findLargestElement(int arr[]) {
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max)
            max=arr[i];
    }
    System.out.println("Max: "+max);
    
  }

  public static void test() {
    
    //int test[]= new int[5];
    //System.out.println(test);// prints the reference address
  } 
}
