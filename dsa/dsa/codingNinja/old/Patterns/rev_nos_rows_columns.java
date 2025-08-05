package Patterns;

import java.util.Scanner;
//?prints numbers in reverse form in the given dimensions of rows and columns
public class rev_nos_rows_columns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r=sc.nextInt();
        System.out.println("Enter the number Columns: ");
        int c=sc.nextInt();
        sc.close();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(r-j);
            }
            System.out.println();
        }
    }
}
