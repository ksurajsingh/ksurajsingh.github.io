import java.util.Scanner;

public class pyramid {
  public static void main(String[] args) {
    System.out.println("\nEnter the number: ");
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();

    System.out.println("\nPrinting a pyramid of numebers, decrementing from midpoint: ");
    pyramidDec(n);
    
  }
  public static void pyramidDec(int n) {
    for(int i=0;i<n;i++){ // rows
      for(int j=0;j<n-1-i;j++){ // columns with spaces
        System.out.print(" ");
      }
      for(int k=0;k<=i;k++){// before midpoint where you increment
        System.out.print(k+1);
      }
     
      for(int l=0;l<i;l++){
        System.out.print(i-l);
      }
    System.out.println();
    }
    
  }
}
