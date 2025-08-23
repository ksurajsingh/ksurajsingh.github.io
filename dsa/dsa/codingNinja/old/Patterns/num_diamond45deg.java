package Patterns;

import java.util.Scanner;
//? prints a diamond starting from rowth element in both incremental and decremental order depending upon columns
public class num_diamond45deg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" !**ODD NUMBERS ONLY**! \n Enter the number of rows: ");
        int n = sc.nextInt(), num = 0, nsp = n / 2, ndg = 1;// num-numbers,ndg-num of digits,nsp-number of spaces
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < nsp; j++)
                System.out.print("  ");// printing nos spaces

            if (i <= n / 2)
                num = i;// initializing numbers if in upper trianlge
            else
                num = n + 1 - i;// initializing number if in lower triangle

            for (int j = 0; j < ndg; j++) {
                System.out.print(num + " ");

                if (j < ndg / 2)// if before the half of the number of digits in a row
                    num++;
                else
                    num--;
            }

            if (i <= n / 2) {// if in the upper triangle -- decrease the spaces and increase the number of digits
                nsp--;
                ndg = ndg + 2;
            } else {// if in the lower triangle -- increase the number of spaces and decrease the
                    // number of digits
                nsp++;
                ndg = ndg - 2;
            }

            System.out.println();
        }
        sc.close();
    }
}