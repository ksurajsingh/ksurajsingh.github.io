package basicPrograms;

import java.util.Scanner;

public class ifGoodInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array :");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            System.out.printf("Enter %d element :",i+1);
            arr[i]=sc.nextInt();
        }
        sc.close();
    }
}