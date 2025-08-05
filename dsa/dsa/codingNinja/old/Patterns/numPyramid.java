package Patterns;

import java.util.Scanner;
//? Printing pyramid of numbers || ONLY FOR 2 DIGITS
public class numPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("# ONLY FOR DOUBLE DIGIT NUMBERS #");
        System.out.println("Enter the number of rows :");
        int n = sc.nextInt();

        System.out.println("Enter the pattern number you want to print [there are only 2]");
        int pn=sc.nextInt();sc.close();

        System.out.printf(" #### pattern %d #### \n",pn);
        printPyramidPattern(pn, n);

    }
    public static void printPyramidPattern(int pn,int n){
        int num=1;
        for (int i = 0; i < n; i++) {//# printing left spaces(Initials)
            if(pn==2)//! pattern 2
                num=1;
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {

                System.out.print(num + " ");//# Printing main numbers

                if(pn==1){
                    if (num < 10)
                       System.out.print(" ");//# conditional spaces for pattern 1
                }
                num++;
            }

            System.out.println();
        }
        System.out.println();

    }
}


