package Patterns;

import java.util.Scanner;
//? Prints 2 right angle pyramid which is inverted hacing right angles on either side
public class invertedRightPyramid {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows :");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();sc.close();
        for(int i=0;i<n;i++) {
            for(int j=0;j<i;j++)
                System.out.print(" ");//# space before printing stars
            for(int j=0;j<n-i;j++)
                System.out.print("*");//# stars
            System.out.println();
        }
        System.out.println("Right angle at left side");
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-i;j++)
                System.out.print("*");//# stars
            for(int j=0;j<i;j++)
                System.out.print(" ");//# space after printing stars
            System.out.println();
        }

    }
}
