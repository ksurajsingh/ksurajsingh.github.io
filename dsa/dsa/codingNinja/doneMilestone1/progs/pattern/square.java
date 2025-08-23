import java.util.Scanner;

public class square{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n=sc.nextInt();
    //instead of communting whole code just comment the funciton call in the beginners dir

    squareStar(n);
    squareRowNum(n);
    squareColNum(n);
    squareColNumRev(n);
  }

  public static void squareColNumRev(int n) {
    for(int i=0;i<n;i++){
      for(int j=0;j<n;++j)// pre or post doesn't matter in for loops
        System.out.print(n-j);
    System.out.println();  
    }  
    System.out.println();
  }


  public static void squareColNum(int n) {
    for(int i=0;i<n;i++){
      for(int j=1;j<=n;++j)// pre or post doesn't matter in for loops
        System.out.print(j);
    System.out.println();  
    }  
    System.out.println();
  }

  public static void squareRowNum(int n) {
    for(int i=1;i<n;++i){
      for(int j=0;j<n;j++)
        System.out.print(i);
    System.out.println();  
    }  
    System.out.println();
  }
  public static void squareStar(int n){
    for(int i=0;i<n;i++){ // rows
       for(int j=0;j<n;j++)// columns
                          System.out.print("*");
      System.out.println();// new line
    }

    System.out.println();
  }
}
