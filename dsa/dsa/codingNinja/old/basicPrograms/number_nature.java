package basicPrograms;
import java.util.Scanner;
//? checks wether a number is positive or not
public class number_nature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        float x=sc.nextFloat();
        sc.close();
        if(x>0){
            System.out.println("Positive");
        }
        if(x<0)
        {
            System.out.println("Negative");
        }
        if(x==0)
        {
            System.out.println("Zero");
        }
    }
}
