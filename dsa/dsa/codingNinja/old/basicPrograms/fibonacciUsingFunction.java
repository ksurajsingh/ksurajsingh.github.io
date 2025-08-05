package basicPrograms;

import java.util.Scanner;
//? Function to find fibonacci 
public class fibonacciUsingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index number of the fibonacci series that you want :");
        int n=sc.nextInt();
        System.out.println(findFibonacci(n));
        sc.close();
    }
    public static int findFibonacci(int n){
        if(n==1)
            return 0;
        if(n==2)
            return 1;
        return findFibonacci(n-1)+findFibonacci(n-2);
    }
}
