package Patterns;

import java.util.Scanner;
//? prints a diamond with a steep of 45deg -- increments stars by 2 in every row
//? 45DEG_DIAMONDS CAN ONLY HAVE ODD OF BREADTH AND LENGTH
public class diamond45deg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" !**ODD NUMBERS ONLY**! ");
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i <= (n / 2); i++) {

            for (int j = 0; j <= ((n / 2) - i); j++)
                System.out.print("  ");
            for (int k = 0; k <= i + i; k++)
                System.out.print("* ");
            System.out.println();
        }

        for (int i = 1; i <= (n / 2); i++) {

            for (int j = 0; j <= i; j++)
                System.out.print("  ");
            if(n%2!=0){// for even numbers
                for(int j=0;j<=(n-i-i)-1;j++)//[n - *rowth no.] of gaps
                    System.out.print("* ");
            }
            if(n%2==0){
            for (int k = 0; k <=(n-i-i); k++)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
