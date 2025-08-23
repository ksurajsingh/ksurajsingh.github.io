package basicPrograms;

import java.util.Arrays;
import java.util.Scanner;
//? to reverse and array
public class array_reversal {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements: ");
            int n=sc.nextInt();
            int[] arr =new int[n];
            for (int i=0;i<n;i++){
                System.out.printf("Enter the %d element:",i+1);
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the starting point of the range that you want to reverse: ");
            int s = sc.nextInt(),temp=0;
            int e = sc.nextInt();
            sc.close();
            System.out.println("Enter the ending point of the range that you want to reverse: ");
            s=s-1;
            e=e-1;
            while(s<e){
                temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
            System.out.println(Arrays.toString(arr));
        }

}
