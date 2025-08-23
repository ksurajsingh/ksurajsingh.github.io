package basicPrograms;

import java.util.Scanner;

public class Handshake{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of persons who handshake with everyone :");
        int n=sc.nextInt(),ans=0;
        for(int i=1;i<n;i++){
            ans=ans+(n-i);
        }
        System.out.println(ans);
        sc.close();
    }
}