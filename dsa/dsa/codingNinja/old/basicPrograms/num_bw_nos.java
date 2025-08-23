package basicPrograms;

import java.util.Scanner;
//? number of numbers between the given range
public class num_bw_nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int i = sc.nextInt();
        System.out.println("Enter the second number: ");
        int j =  sc.nextInt();
        sc.close();
        System.out.printf("The number of numbers between %d and %d are %d",i,j,nos(i,j));

    }


    public static int nos(int i, int j){
        if(i>j){
            return (i-j)+1;
        }
        else
            return j-i+1;
    }
}
