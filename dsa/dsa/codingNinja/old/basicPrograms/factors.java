package basicPrograms;

import java.util.Scanner;
//? */ to find factors and number of factors for the given number
public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt(),count=1;
        sc.close();
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                System.out.println(i);
                count++;
            }

        }
        System.out.println("\nTotal number of factors are: "+count);
    }

}
