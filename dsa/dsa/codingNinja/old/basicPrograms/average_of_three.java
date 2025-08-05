package basicPrograms;
import java.util.Scanner;
//? prints the average of 3 given numbers
    public class average_of_three {
    // write a program to find the average of three numbers
        public static void main(String[] args)
        {
            System.out.println("Enter first number: ");
            Scanner sc = new Scanner(System.in);
            Float a = sc.nextFloat();
            System.out.println("Enter second number: ");
            Float b = sc.nextFloat();
            System.out.println("Enter third number: ");
            Float c = sc.nextFloat();
            sc.close();
            Float sum=(a+b+c)/3;
            System.out.println(sum);
        }

}
