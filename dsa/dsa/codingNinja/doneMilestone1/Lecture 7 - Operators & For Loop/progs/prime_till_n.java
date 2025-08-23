//package Lecture 7 - Operators & For Loop.progs;

import java.util.Scanner;

public class prime_till_n{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        boolean prime=true;
        for(int i=2;i<n;i++){
            for(int j=2;j<i;j++){
                prime=true;
                if(i%j==0){
                    prime=false;
                    break;
                }
            }
            if(prime){
                System.out.println(i);
            }
        }
        sc.close();

    }
}