package Patterns;

import java.util.Scanner;
//? just for fun printing the right triangle and pyramid in a single function starting from rowth element and 1 also
public class nos_rows_columns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = "\0", a = "\0", p = "\0";
        int r = 0, c = 0;
        boolean again = true;
        while (again) {// if the user wants to print again
            // declaring the number of rows and columns
            System.out.println("Enter the number of Rows: ");
            r = sc.nextInt();
            System.out.println("Enter the number of columns: ");
            c = sc.nextInt();

            // wether to print row number or column number or both
            System.out.println("A.Row number \tB. Column number \tC.both\nDo you want to print A,B or C? ");
            n = sc.next();
            // FOR ROW NUMBERS
            if (n.equals("a") || n.equals("c")) {// checks for row numbers or both

                System.out.println("\n  **Printing Row Numbers** ");
                System.out.printf("Press P for Pyramid, T for Right Triangle, B for both!");
                // checks for pyramid or right tiranlge or both
                p = sc.next();

                // PRINTING PYRAMID
                if (p.equals("p") || p.equals("b")) {

                    System.out.println("\n**Pyramid**");
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j <= i; j++)
                            System.out.print(i + 1);

                        System.out.println();
                    }
                }
                // PRINTING RIGHT TRIANGLE
                if (p.equals("t") || p.equals("b")) {
                    System.out.println("\n**Right Triangle**");
                    for (int i = 1; i <= r; i++) {
                        for (int j = 0; j < c; j++)
                            System.out.print(i);

                        System.out.println();
                    }
                }
            }
            // FOR COLUMN NUMBERS
            if (n.equals("b") || n.equals("c")) {// checks for column numbers or both

                System.out.println("\n  **Printing Column Numbers** ");
                System.out.printf("Press P for Pyramid, T for Right Triangle, B for both!");
                // for checks for pyramid or Right trianlge or both
                p = sc.next();
                // FOR PYRAMID
                if (p.equals("p") || p.equals("b")) {

                    System.out.println("\n**Pyramid**");
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j <= i; j++)
                            System.out.print(j + 1);
                        System.out.println();
                    }
                }
                // FOR RIGHT TRIANGLE
                if (p.equals("t") || p.equals("b")) {

                    System.out.println("\n**Right Triangle**");

                    for (int i = 0; i < r; i++) {
                        for (int j = 1; j <= c; j++)
                            System.out.print(j);
                        System.out.println();
                    }

                }
            }

            // FOR MULTIPLE ITERATIONS OF PRINTING
            System.out.println("Do you want to print again: \nA. YES \tB. NO");
            a = sc.next();
            if (a.equals("a")) {
                again = true;
            } else
                again = false;
        }
        sc.close();
    }
}
