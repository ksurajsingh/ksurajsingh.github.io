package basicPrograms;

import java.util.Scanner;
//? changing the index of bit to 1
//# adding 2raised to that index to that number
public class numberNatureUsingBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();sc.close();
        if((n&1)==0)
            System.out.println("Even");
        else
            System.out.println("odd");
    }
}