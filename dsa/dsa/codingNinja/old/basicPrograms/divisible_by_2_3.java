package basicPrograms;

import java.util.*;
//? checks if a number if divisible by 2 and 3
public class divisible_by_2_3 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(n%2==0 || n%3==0)
                System.out.println("divisible");
        else
                System.out.println("not divisible");
    }
}
