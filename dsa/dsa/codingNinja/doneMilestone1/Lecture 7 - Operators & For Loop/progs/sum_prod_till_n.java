//package Lecture 7 - Operators & For Loop.progs;

import java.util.Scanner;

public class sum_prod_till_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n =sc.nextInt();
        System.out.println("Enter c: ");
        int c =sc.nextInt();
        int var=1;
        for(int i=2;i<=n;i++){
            if(c==1){
                var=var+i;
            }
            else if(c==2){
                var=var*i;
            }
            else{
                System.out.println("-1");
                break;
            }
        }
        System.out.println(var);
        sc.close();
    }
}
