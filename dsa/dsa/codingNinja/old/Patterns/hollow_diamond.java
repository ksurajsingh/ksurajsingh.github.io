package Patterns;
import java.util.Scanner;
//?prints a diamond shape out of stars with gaps filled in  between
public class hollow_diamond {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        sc.close();
        for (int i=0; i<=(n/2);i++){// ((n/2)+1) rows

            for(int j=0;j<=((n/2)-i);j++)// n/2 - row nos stars
                System.out.print("* ");
            for(int j=0;j<=i+i;j++)//gaps = (row+row)th number
                System.out.print("  ");
            for(int j=0;j<=((n/2)-i);j++)// n/2 - row stars
                System.out.print("* ");

            System.out.println();
        }
        for (int i=1;i<=(n/2);i++) {//n/2 rows

            for(int j=0;j<=i;j++)//row+1 of stars
                System.out.print("* ");
            if(n%2!=0){
                for(int j=0;j<=(n-i-i)-1;j++)//[n - *rowth no.] of gaps
                    System.out.print("  ");
            }
            if(n%2==0){
                for(int j=0;j<=(n-i-i);j++)//[n - *rowth no.] of gaps
                        System.out.print("  ");
            }
            for(int j=0;j<=i;j++)//[n/2 + (no. row-1)] of stars
                System.out.print("* ");

            System.out.println();
        }
    }
}

