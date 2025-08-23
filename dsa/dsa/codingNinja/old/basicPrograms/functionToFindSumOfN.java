package basicPrograms;

import java.util.ArrayList;
import java.util.Scanner;
//?Function to find the sum of first n numbers in the given set of number or in the set of natural numbers
public class functionToFindSumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers :");
        int n=sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            System.out.printf("Enter the %d number ",i+1);
            numbers.add(i,sc.nextInt());
        }
        System.out.println(sum(numbers,n-1));
        System.out.println("Do you want sum of first n natural numbers?\n1.Yes\t2.No");
        int opt=sc.nextInt();
        if(opt==1){
            System.out.println("Enter n :");
            int nfornaturalnums=sc.nextInt();
            System.out.println(sumOfFirstNaturalNumbers(nfornaturalnums));
        }
        sc.close();
    }

    public static int sum(ArrayList<Integer> numbers,int n){
        if(n==0)
            return numbers.get(0);
        else
            return sum(numbers,n-1)+numbers.get(n);
    }

    public static int sumOfFirstNaturalNumbers(int nfornaturalnums){
        if(nfornaturalnums==1)
            return 1;
        else
            return nfornaturalnums+sumOfFirstNaturalNumbers(nfornaturalnums-1);
    }
}
