package Patterns;

import java.util.Scanner;
//? unessary code TOO MUCH EXPERIENCE
public class zigzag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length");
        int l=sc.nextInt();

        System.out.println("Enter the breadth");
        int b=sc.nextInt();sc.close();

        for(int j=0; j<b; j++) {
            if(j%3==0)
                System.out.print("*");
            else
                System.out.print(" ");
        }

        for(int i=0; i<l; i++) {
            for(int j=0;j<b;j++){

            }
            System.out.println();
        }
    }
}
