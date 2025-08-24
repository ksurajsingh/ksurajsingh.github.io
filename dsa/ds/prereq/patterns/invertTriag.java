import java.util.Scanner;

public class invertTriag{
  public static void main(String[] args) {

    System.out.println("\nEnter the number: ");
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();

    System.out.println("\nVertically Inverted right triangle: ");
     vertInvrtRTTriag(n);

     System.out.println("\n Laterally Inverted right triangle ");
     latInvrtRTTriag(n);

     System.out.println("\n Right triangle");
     rtTriag(n);
    
  }

  public static void vertInvrtRTTriag(int n) {
    for(int i=0;i<n;i++){
      for(int j=0;j<n-i;j++){
         System.out.print("*");
      }
      System.out.println();
    }
    
  }
  public static void latInvrtRTTriag(int n) {
     for(int i=0;i<n;i++){
      for(int j=0;j<n-i;j++) // printnig the vertically inverted right trianlge of spaces
         System.out.print(" ");
      System.out.print("*");
      for(int k=0;k<=i;k++)
          System.out.print("*");
      System.out.println();
     }
    
  }
  public static void rtTriag(int n) {
    for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
}
