package basicPrograms;

import java.util.Arrays;
import java.util.Scanner;
//? rotates the array n number of times
public class n_times_rotations_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt(),nor;
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            System.out.printf("Enter the %d element: ",i+1);
            arr[i]=sc.nextInt();
        }
        arr=arr_rev(arr,0,n-1);
        System.out.println("Enter the number of rotations");
        nor=sc.nextInt();
        sc.close();
        nor=nor%n;
        arr=arr_rev(arr,0,nor-1);
        arr=arr_rev(arr,nor,n-1);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arr_rev(int[] arr,int s,int e){
        int temp=0;
        while(s<e){
            temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        return arr;
    }

}
