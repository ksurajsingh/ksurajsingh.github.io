package Patterns;

import java.util.Scanner;
//? Program to print a non-scaled butterfly given the width of one wing
public class butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int n= sc.nextInt();
        sc.close();
        for(int i=0; i<n; i++) {//! Upper half
            for(int j=0;j<=i;j++)
                System.out.print("* ");//# left wing
            for(int j=1;j<((n*3)-(i*4));j++)
                System.out.print(" ");//# spaces || I made formula
            for(int j=0;j<=i;j++){
                if(j==n-1)
                    break;
                System.out.print("* ");//# right wing
            }
            System.out.println();
        }
        for(int i=0; i<n; i++) {//! Lower half
            for(int j=n-i-1;j>0;j--)
                System.out.print("* ");//# left wing
            for(int j=0;j<(2+(i*4));j++)
                System.out.print(" ");//# spaces || I made a formula
            for(int j=1;j<n-i;j++)
                System.out.print("* ");//# right wing
            System.out.println();
        }
    }
}
