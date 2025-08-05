import java.util.Scanner;

public class integerDivison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        String s = sc.next();
        int num1 = Integer.parseInt(s);
        System.out.println("Enter the second number :");
        String ss = sc.next();
        int num2 = Integer.parseInt(ss);
        System.out.println("Performing Division...");
        int result = num1/num2;
        System.out.println(result);
        sc.close();

    }
}
