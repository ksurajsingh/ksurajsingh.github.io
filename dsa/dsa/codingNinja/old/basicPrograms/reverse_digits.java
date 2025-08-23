package basicPrograms;
import java.util.Scanner;
//? reverse givn digits in a number
public class reverse_digits
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt(),rev_num=0,ld=0;
        sc.close();
        while(n>0){
            ld=n%10;
            rev_num=rev_num*10+ld;
            n=n/10;
        }
        System.out.println(rev_num);
    }

}