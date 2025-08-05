package basicPrograms;
import java.util.Scanner;
//? prints the gcd of 2 given numbers
public class GCD{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x=sc.nextInt();
        System.out.println("Enter the second number: ");
        int y=sc.nextInt();
        sc.close();
        System.out.println("The GCD of these is: "+ gcd(x,y));

    }

    public static int gcd(int a,int b)
    {
        if(b==0)
            return a;

        if(a==0)
            return b;

        if(a>b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
}