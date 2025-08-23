package Patterns;

import java.util.Scanner;
//? program to print a rectangle /square
public class rectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the breadth :");
        int b = sc.nextInt();
        System.out.println("Enter the Length :");
        int l = sc.nextInt();sc.close();
        for(int i=0;i<l;i++){
            for(int j=0;j<b;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
