import java.util.Scanner;
public class characters {

  public static void main(String[] args) {
    System.out.println("\nEnter the numebr: ");
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
    System.out.println("\n Square Alphabets refreshes in the new row");

    alphaRefreshRow(n);
    System.out.println("\n Square Alphabets where each row start from the row num corresponding Alphabet");
    alphaRowFromRowNum(n);
    
  }
  public static void alphaRefreshRow(int n) {
    for(int i=1;i<=n;i++){
      for(int j=0;j<n;j++){
        System.out.print((char)('A'+j));
      }
      System.out.println();
    }
    
  }
  public static void alphaRowFromRowNum(int n) {
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.print((char)('A'+i+j));
      }
      System.out.println();
    }
    
  }

}
