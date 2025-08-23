package basicPrograms;

import java.util.Scanner;

public class turnGivenBitON {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in decimal form :");
        int n=sc.nextInt();
        System.out.println("Enter the bit number you want to change (starting from 0) :");
        int k=sc.nextInt(),ans;sc.close();
        ans=n|(1<<k);
        System.out.println("The number after the bit is turned on is "+ans);

    }
}
