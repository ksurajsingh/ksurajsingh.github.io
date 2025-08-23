package Patterns;
import java.util.Scanner;
//? Prints right triangle+ vertically inversed + laterally inversed
public class right_trianlge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbre of rows: ");
        int n =sc.nextInt();
        sc.close();
        for(int j=1;j<=n;j++){


            for(int i=0;i<j;i++){
                System.out.print(" *");

            }
            System.out.println();
        }
        System.out.println("\n\n\t***VERRTICAL INVERSED RIGHT TRIANGLE");
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("\n\n\t***LATERAL INVERSED RIGHT TRIANGLE");
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
