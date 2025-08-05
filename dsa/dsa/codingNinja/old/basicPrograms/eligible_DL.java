package basicPrograms;
import java.util.Scanner;
//? checks if the age if eligible for a DL
public class eligible_DL {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n>=18){
            System.out.println("eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }
}