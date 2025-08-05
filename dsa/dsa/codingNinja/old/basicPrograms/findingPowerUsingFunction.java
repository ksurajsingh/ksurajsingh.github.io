package basicPrograms;

import java.util.Scanner;
//? Function to find the power of a given number. In n/2 time complexity as well
public class findingPowerUsingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose power you want to find :");
        double n=sc.nextInt();
        System.out.println("Enter the power :");
        double p=sc.nextInt();
        System.out.println(findingPower(n,p));
        System.out.println("faster way\n"+findingPower(n,p));
        sc.close();
    }
    public static double findingPower(double n,double p){
        if(p==1)
            return n;
        double temp=findingPower(n, p-1);
        return temp*n;
    }

    public static double findingPowerFaster(double n,double p){
        if(p==1)
            return n;
        double temp=findingPowerFaster(n, p/2);
        if(n%2==0)
            return temp*temp;
        else
            return temp*temp*n;
    }
}
