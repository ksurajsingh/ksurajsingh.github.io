package basicPrograms;
import java.util.Scanner;
//? checks if a given number is prime or not
public class is_prime {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(n==1)
            System.out.println("Not prime");
        if(!notprime(n))
            System.out.println("Prime");
        if(notprime(n))
            System.out.println("Not prime");
        }

        public static boolean notprime(int n) {
        for(int i=2; i<=n; i++) {
            if(n%i==0 && n!=i)
                return true;
            }
        return false;
    }
}
