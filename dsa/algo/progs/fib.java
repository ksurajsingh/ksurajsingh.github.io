import java.util.Arrays;

public class fib{


  // using memoization
  

  static int dp[];
  
  public static int fibm(int n){
     dp = new int[n+1];
     Arrays.fill(dp,-1);
     return fibmemo(n);
  }

  public static int fibmemo(int n){
    if(n<=1) return n;
    if(dp[n]!=-1) return dp[n]; // already computed
    dp[n]=fibmemo(n-1)+fibmemo(n-2);
    return dp[n];

  }


  public static int fib(int n){
    if(n<=1) return n;
    return fib(n-1)+fib(n-2);

  }

  public static void main(String args[]){
    System.out.println(fibm(10));
  }
}
