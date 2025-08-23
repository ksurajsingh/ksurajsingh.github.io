package basicPrograms;

import java.util.Scanner;
//? checks if the number is present in fibonacci series or not - WITHOUT A FUNCITON!
public class is_fibonacci2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:  ");
        int n = sc.nextInt();
        sc.close();
        int[] fb=new int[n+2];
        fb[0]=0;
        fb[1]=1;
        boolean isin=false;
        for(int i = 2; i < n; i++) {
            fb[i]=fb[i-1]+fb[i-2];
        }
        for(int i = 0; i <= n; i++) {
            if(fb[i]==n){
                isin=true;
                break;
            }
            else{
                isin=false;
            }
        }
        if(isin)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
