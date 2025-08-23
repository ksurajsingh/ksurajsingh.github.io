package basicPrograms;
import java.util.Scanner;
//? concatenation of Integers,doubles,Strings
public class concatenation {
    public static void main(String[] args) {
        int i=4,j;
        double d=4.0,e;
        String s="HackerRank ",t;
        Scanner sc = new Scanner(System.in);
        j=sc.nextInt();
        e=sc.nextDouble();
        sc.nextLine();
        t=sc.nextLine();
        sc.close();
        System.out.println(i+j);//printing integer
        System.out.println(d+e);//printing double
        System.out.println(s.concat(t));//printnig String

    }
}
