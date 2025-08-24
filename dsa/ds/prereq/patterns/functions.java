import java.util.Scanner;

public class functions {

     public static double sum(int a, int b){ // prints the right value just pass integers and gives a double
        return a+b;
     }
     //public static int sum(int a, int b){ duplication
     //   return a+b;
     //}
     public static int sum(int a){
        return a;
     }


  public static void main(String[] args) {
    
    System.out.println(sum(5,6));
    // System.out.println(sum(5.5,6.6));
    System.out.println(sum((int)5.5,(int)6.6));
    System.out.println(sum(5));
    System.out.println(sum(5));
    calcNCR();




      }
  public static int fact(int n) {
      int fact=1;
      for(int i=1;i<=n;i++){
      fact=fact*i;
    }
    System.out.println(fact);
    return fact;
    
  }

  public static void calcNCR() {
    
  Scanner sc = new Scanner(System.in);
    System.out.println("\n Enter n: ");
    int n = sc.nextInt();
    System.out.println("\n Enter r: ");
    int r = sc.nextInt();
     
    fact(5);

    int factn=fact(n);
    int factr=fact(r);
    int factt=fact(n-r);

    int res=factn/(factr * factt);
    System.out.println(res);

  }
}
