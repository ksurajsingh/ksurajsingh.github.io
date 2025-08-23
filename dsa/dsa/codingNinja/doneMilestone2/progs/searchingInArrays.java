import java.util.Scanner;

public class searchingInArrays {
  public static void main(String[] args) {
   int arr[]=takeInput(); 
   int res=binSearch(arr);
   System.out.println(res);
  }
  public static int binSearch(int arr[]) {
   System.out.println("\nEnter the element you want to find: "); 
   Scanner sc = new Scanner(System.in);
   int n=sc.nextInt();
   int s=0,e=arr.length-1;
   while(s<e){
      int mid=(s+e)/2;
      if(arr[mid]>n){
        e=mid-1;
      }
      else if(arr[mid]<n){
         s=mid+1;
      }
      else
        return mid+1;
    }
    return -1; 
  }

 public static int[] takeInput() {
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


  public static void problematic(int arr[]) {
   System.out.println("\nEnter the element you want to find: "); 
   Scanner sc = new Scanner(System.in);
   int n=sc.nextInt();
   int s=0,e=arr.length-1,ind=0;
   while(s<e){
      int mid=(s+e)/2;
      if(arr[mid]>n){
        e=mid-1;
      }
      else if(arr[mid]<n){
         s=mid+1;
      }
      else
        ind=mid;
    }
   if(s<e)
      System.out.println("-1");
   else 
     System.out.println(ind);
  }

 }
