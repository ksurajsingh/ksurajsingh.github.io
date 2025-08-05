package Patterns;

import java.util.Scanner;
//? Program to print a hollow rectangle given the dimensions
public class hollowRectangleSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter breadth :");
        int b=sc.nextInt();
        System.out.println("Enter length :");
        int l=sc.nextInt();sc.close();
        for(int i=0; i<l; i++) {
            if(i==0 || i==l-1){
                for(int j=0; j<b;j++){
                    System.out.print("* ");
                }
            }else{
                for(int j=0;j<(b+b);j++){
                    if(j==0 || j==((b+b)-2))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();

        }

    }
}
