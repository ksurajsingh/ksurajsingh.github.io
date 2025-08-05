package Patterns;

import java.util.Scanner;
//? Prints all the real numbers until it forms a right triangle of the given number o frows
public class all_nos_within_rt_triag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt(),num=1;
        sc.close();
        for(int i=0;i<r;i++) {
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

}
