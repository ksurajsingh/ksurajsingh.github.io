package basicPrograms;

import java.util.Scanner;
//? saying hello to the weak world!
public class hello_world {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n =sc.nextLine();
        sc.close();
        System.out.println("hello, World.\n"+n);
    }
}
