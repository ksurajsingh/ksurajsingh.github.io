package basicPrograms;

import java.util.Scanner;
//? checks if a given number is perfect square
public class checks_if_SQRT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose square root you want to find: ");
        int n=sc.nextInt(),ans=0;
        sc.close();
        for(int i=0;i*i<=n;i++){
            ans=i;
        }
        if(ans*ans==n){
            System.out.println("It is a perfect square");
        }
        else{
            System.out.println("It is not a perfect square");
        }

    }

}
