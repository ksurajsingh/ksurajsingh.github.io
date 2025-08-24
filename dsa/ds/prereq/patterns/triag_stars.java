// package Lecture 6 - Patterns 2;

public class triag_stars {
    public static void main(String[] args) {
        int i = 4, j;
        while (i > 0) {
            j = 0;
            while (j < i) {
                System.out.print("* ");
                j++;
            }
            i--;
            System.out.println("");
        }

        System.out.println("\n\n******************\n\n");

        i = 4;
        int s;
        while (i > 0) {
            s = 0;
            while (s < i - 1) {
                System.out.print(" ");
                s++;
            }
            j = 0;
            while (j <= 4 - i) {
                System.out.print("*");
                j++;
            }
            i--;
            System.out.println("");
        }

        // ! ISOSCELES WITH NUMBERS

        System.out.println("\n\n******************\n\n");

        i = 4;
        int var;
        while (i > 0) {
            s = 0;
            var = 1;
            while (s < ((i * 2) - 2)) {
                System.out.print(" ");
                s++;
            }
            j = 0;
            while (j <= 4 - i) {
                System.out.print(var + " ");
                j++;
                var++;
            }
            var -= 2;
            j = 0;
            while (j <= 4 - i - 1) {
                System.out.print(var + " ");
                j++;
                var--;
            }
            i--;
            System.out.println("");
        }

        System.out.println("\n\n******************\n\n");

        int n = 5;
        for ( j = 0; j < n / 2 + 1; j++) {
            for (int k = 0; k < n / 2 - j; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < j + 1; k++) {
                System.out.print("*");
            }
            for (int k = 0; k < j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for ( j = n / 2; j > 0; j--) {
            for (int k = 0; k < n / 2 - j + 1; k++) {
                System.out.print(" ");
            }
            for (int k = j; k > 0; k--) {
                System.out.print("*");
            }
            for (int k = j - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\n******************\n\n");
        
        n=5;
        System.out.println("*");
        for(i=0;i<n;i++){
            System.out.print("*");
            var=1;
            for(j=0;j<=i;j++){
                System.out.print(var);
                var++;
            }
            var--;
            for(j=0;j<=i-1;j++){
                var--;
                System.out.print(var);
            }
            System.out.print("*");
            System.out.println();
        }
        for(i=1;i<n-1;i++){
            System.out.print("*");
            var=1;
            for(j=0;j<n-i;j++){
                System.out.print(var);
                var++;
            }
            var--;
            for(j=0;j<n-i-i;j++){
                var--;
                System.out.print(var);
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.println("*");
        
        System.out.println("\n\n******************\n\n");
        
        n=4;
        for(i=0;i<n;i++){
            for(s=0;s<i;s++){
                System.out.print(" ");
            }
            for(j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\n******************\n\n");

        n=5;
        int sum;
        for(i=0;i<n;i++){
            var=1;
            sum=0;
            for(j=0;j<=i;j++){
                if(j==i)
                    System.out.print(var);
                else    
                    System.out.print(var+"+");

                    sum+=var;
                    var++;
            }
            System.out.print("="+sum);
            System.out.println();
        }
    }
}
