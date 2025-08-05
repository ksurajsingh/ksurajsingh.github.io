package Patterns;

import java.util.Scanner;
//? Prints the alphabets starting from a till the end of the number of columns specified and the 2nd pattern starts from rowth alphabet 
public class alpha_rows_columns{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int r=sc.nextInt();
        System.out.println("enter the number of columns: ");
        int c=sc.nextInt();
        sc.close();
        for(int i=0; i<r; i++) {
            for(int j=0;j<c;j++){
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }

        System.out.println("\t***PRINTING SECOND PATTERN***");
        char alpha='A';
        for(int i=0; i<r; i++) {
            alpha=(char)('A'+i);
            for(int j=0;j<c;j++){
                System.out.print((char)(alpha+j));
            }
            System.out.println();
        }
    }
}