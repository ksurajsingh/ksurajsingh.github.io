package basicPrograms;

import java.util.Scanner;
//?calculates the number nature without the use of mathematical operations */
public class number_nature_bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter :");
        int n =sc.nextInt();
        sc.close();
        if( (n&1) == 0){
            System.out.println("even");
        }
        else
            System.out.println("odd");
    }
}
