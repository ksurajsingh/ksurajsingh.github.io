package Milestone_3.progs;
import java.util.Scanner;
import doneMilestone2.progs.arrays;

public class basicRecursion{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number: ");
    int n=sc.nextInt();
    System.out.printf("Factorial of %d is : %d \n",n,fact(n));
    System.out.printf("The sum of first %d natural numbers is: %d\n",n,sumNNumbers(n));
    System.out.printf("The fibonacci number of %d is: %d\n",n,fibonacci(n));
    System.out.println("\nChecking if the array is sorted\n ");
    int arr[]=arrays.takeArrInput();
    System.out.println(isArrSorted(arr,0));
    System.out.println("\nFinding first index of specified number , specify number : ");
    int num=sc.nextInt();
    System.out.printf("\n The number %d is first found at index: %d\n",num,(findFirstIndex(arr,num,0)+1));
    System.out.println("\nFinding last index of specified number in O(2n), specify number : ");
    System.out.printf("\n The number %d is last found at index: %d\n",num,(findLastIndex(arr,num,0)+1));
     System.out.println("\nFinding last index of specified number in O(n), specify number : ");
    System.out.printf("\n The number %d is last found at index: %d\n",num,(findLastIndex2(arr,num,arr.length-1)+1));
    
   
  }
  public static int findLastIndex(int arr[],int num,int startIndex) { // this takes O(n*n)
    if(startIndex==arr.length)
        return -1;
    int temp=findLastIndex(arr,num,startIndex+1);
    if(temp!=-1)
      return temp;
    else{
      if(arr[startIndex]==num)
        return startIndex;
    
      else  
        return -1;
    }
    
  }
  public static int findLastIndex2(int arr[], int num, int lastIndex) {
    if(lastIndex==-1)
      return -1;

    if(arr[lastIndex]==num)
      return lastIndex;

    int temp=findLastIndex2(arr,num,lastIndex-1);
    return temp;


    
  }
  public static int findFirstIndex(int arr[], int num, int startIndex) {
    if(startIndex==arr.length)
      return -1;

    if(arr[startIndex]==num)
      return startIndex;

    int temp=findFirstIndex(arr,num,startIndex+1);
    return temp;
    
  }
  public static boolean isArrSorted(int arr[], int startIndex) {
    if(startIndex==arr.length-1)
      return  true;
    if(arr[startIndex]>arr[startIndex+1])
      return false;
    boolean temp = isArrSorted(arr,startIndex+1);
    return temp; 
  }
  public static int fibonacci(int n) {
    if(n==1 | n==2){
      return 1;
    }
    int temp = fibonacci(n-1)+fibonacci(n-2);
    return temp;
  }
  public static int sumNNumbers(int n) {
    if(n==0){
      return 0;
    }
    int temp = n+sumNNumbers(n-1);
    return temp;
    
  }
  public static int fact(int n) {
    if(n==1 || n==0){
      return 1;
    }
    int output=n*(fact((int)n-1));
    return output;
    
  }
}
