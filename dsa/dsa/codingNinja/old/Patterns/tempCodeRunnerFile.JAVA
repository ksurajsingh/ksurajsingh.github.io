package Patterns;

import java.util.Scanner;

public class rhombus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int l=sc.nextInt();
        System.out.println("Enter the number of columns :");
        int b=sc.nextInt();sc.close();
        for(int i=0; i<l; i++){
            for(int j=0;j<l-i;j++)
                System.out.print("  ");
            for (int j=0;j<b;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}