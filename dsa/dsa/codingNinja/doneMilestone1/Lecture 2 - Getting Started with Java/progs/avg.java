//package progs;

import java.util.Scanner;

public class avg{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name: ");
    String name = sc.next();
    System.out.println("Enter marks for all 3 subjects: ");
    int m1,m2,m3;
    m1=sc.nextInt();
    m2=sc.nextInt();
    m3=sc.nextInt();
    int avg=(m1+m2+m3)/3;
    System.err.printf("\nThe average of 3 subjects for %s is: %d\n\n",name,avg);
    sc.close();
    }
}