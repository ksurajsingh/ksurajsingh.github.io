package Patterns;

import java.util.Scanner;
//? to print the right triangle when specified the number of rows with number as its content
public class rowth_nos_rt_triag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt(),num=1;
        sc.close();
        for(int i=1;i<=r;i++) {
            num=i;
            for(int j=0;j<i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

}
