package basicPrograms;
import java.util.Scanner;
//? checks if the given dimensions is valid for a triangle or not
public class is_valid_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        float a=sc.nextFloat();
        System.out.println("Enter the second number");
        float b =sc.nextFloat();
        System.out.println("Enter the third number");
        float c =sc.nextFloat();
        sc.close();
        if(((a+b)>c) && ((a+c)>b) && ((b+c)>a))
        {
            System.out.println("It is a valid triangle dimension");
        }
        else{
            System.out.println("Dimensions not valid for a trianlge");
        }
    }
}
