package basicPrograms;

import java.util.Scanner;
//? */ to find the combinations for a given number of columns(R) and row(N) nCr
public class NcR{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n=sc.nextInt(),r,fact_N,fact_R,fact_NR;
        System.out.println("Enter R:");
        r=sc.nextInt();
        sc.close();
        fact_N= factorial(n);
        System.out.println(fact_N);
        fact_R= factorial(r);
        System.out.println(fact_R);
        fact_NR= factorial(n-r);
        System.out.println(fact_NR);
        System.out.println(fact_N / (fact_R * fact_NR));
    }

    public static int factorial(int num){
        for(int i=1;i<=num;i++){
            num=num*i;
        }
        return num;
    }
}