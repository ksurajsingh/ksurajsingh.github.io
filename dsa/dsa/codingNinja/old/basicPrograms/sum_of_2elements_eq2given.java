package basicPrograms;

import java.util.Scanner;
//? program to check if there exists a pair of elements that sums up to the given number!
public class sum_of_2elements_eq2given {
    public static void main(String[] args) {
//
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        boolean exist=false;
        for(int i=0;i<n;i++){
            System.out.printf("Enter the %d element: ",i+1);
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the sum: ");
        int sum=sc.nextInt();
        sc.close();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==sum)
                    exist=true;
            }
        }
        if(exist)
            System.out.println("Exists!");
        else
            System.out.println("Does not Exists!");

    }

}
