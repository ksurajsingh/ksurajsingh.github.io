package basicPrograms;
import java.util.Scanner;
//? prints the factorial of the given number
public class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        sc.close();
        int factorial=1;
        for(int i=1;i<=n;i++)
        {
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}
