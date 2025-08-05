package Patterns;

import java.util.Scanner;
//? prints the stars for the given number of rows and columns
public class rows_columns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of rows: ");
        int c = sc.nextInt();
        sc.close();
        for (int i = 0; i < r; i++) {
            for(int j=0;j<c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
