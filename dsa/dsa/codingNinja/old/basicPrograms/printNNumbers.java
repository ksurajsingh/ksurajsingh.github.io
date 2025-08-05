package basicPrograms;

import java.util.Scanner;

public class printNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n=sc.nextInt();
        System.out.println("What order to you want to print\n1.From Onw\t2.To one\t3.Both");
        int opt=sc.nextInt();
        switch(opt){
            case 1: System.out.println("\n### Printing from One ###");
                    printingFromOne(n);
                    break;

            case 2: System.out.println("\n### Printing to One ###");
                    printingToOne(n);
                    break;

            case 3: System.out.println("\n### Printing from One ###");
                    printingFromOne(n);
                    System.out.println("\n### Printing to One ###");
                    printingToOne(n);
        }
        sc.close();
    }
    public static void printingFromOne(int n){
        if(n==1){
            System.out.println("1");
            return;
        }
        printingFromOne(n-1);
        System.out.println(n);
    }
    public static void printingToOne(int n){
        if(n==1){
            System.out.println("1");
            return;
        }
        System.out.println(n);
        printingToOne(n-1);
    }
}
