package Patterns;

import java.util.Scanner;

//?prints the right triangle using consecutive numbers

public class num_rt_trianlge {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n=sc.nextInt();
        sc.close();
        int num=1;
        for (int i=0; i<n;i++){
            for(int j=0;j<=i;j++){
               System.out.print(num+" ");
               num=num+1;
            }
            System.out.println();
        }
    }
}
