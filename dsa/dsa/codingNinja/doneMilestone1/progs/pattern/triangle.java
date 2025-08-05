import java.util.Scanner;

public class triangle {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n=sc.nextInt();

    System.out.println("\nRight Triangle where the values are column numbers \n");
    rtColNum(n);
    System.out.println("\n Right Triangle where the values keep on incrementing \n");
    rtVarInc(n);
    System.out.println("\n Right Triangle where the row starts from the row number and keeps on incrementing \n");
    rtRowStartFromRowNum(n); 
  }
  public static void rtColNum(int n) {
    for (int i = 1; i <= n; i++) {
      for(int j=1;j<=i;j++){
        System.out.print(j);
      }
      System.out.println();
      
    }
    
  }
  public static void rtVarInc(int n) {
    int p=1;
    for (int i=1;i<=n;i++){
      for (int j=1;j<=i;j++){
        System.out.print(p+" ");
        p++;
      }
      System.out.println();
    }
    
  }
  public static void rtRowStartFromRowNum(int n) {
    for(int i=1;i<=n;i++){
      for(int j=0;j<i;j++){
        System.out.print(i+j+" ");
      }
      System.out.println();
    }
    
  }
}
