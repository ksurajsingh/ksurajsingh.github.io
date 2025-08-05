package basicPrograms;

import java.util.Scanner;
//? prints the sum of all even numbers till the given number
public class sum_of_evens {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        sc.close();
        float sum=0;
        int d=0;
        while(n>0){
            if(n>0){
                d=n%10;
                n=n/10;
                sum=sum+d;
            }
        }
        System.out.println(sum);
    }
}
