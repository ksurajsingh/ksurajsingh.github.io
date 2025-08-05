package basicPrograms;
import java.util.Scanner;
//? checks if the given number is present in fibonacci series or not
public class is_fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.close();
        if(exist(n))
        {
            System.out.println(n+" is a fibonacci number");
        }
        else
            System.out.println("Not a febonacci number");


    }
    public static boolean exist(int n)
    {
        int a=0,b=1,f=0;
        if(n==0)
            return true;
        if(n==1)
            return true;
        while(true){
            f=b+a;
            a=b;
            b=f;
            if(f==n)
                return true;
            else if(f>n)
                return false;
        }
    }
}
