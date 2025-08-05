package basicPrograms;

import java.util.Scanner;

//? program to count the number of elements greater elements than itself in the array
public class elemts_greater_than_itself_in_a_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n =sc.nextInt(),max=Integer.MIN_VALUE,count=0;
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            System.out.printf("Enter the %d element: ",i+1);
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0; i<n; i++){
            if(arr[i]>=max)
                max=arr[i];
        }
        for(int i=0; i<n; i++){
            if(arr[i]!=max)
                count++;
        }
        System.out.println(count);
    }

}
