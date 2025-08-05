package Patterns;

import java.util.Scanner;
//? prints a diamond of steep 60 deg -- increments stars by 1 in every row
public class diamond60deg {
    public static void main(String[] args) {

        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            //number of rows in first half shape
            int n = sc.nextInt();
            sc.close();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= (n - i); k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }


    }
}
