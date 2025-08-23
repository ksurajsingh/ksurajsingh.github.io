package basicPrograms;

import java.util.ArrayList;
import java.util.Scanner;
//?Function to find first index of a given number in the array
public class firstIndexInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array :");
        int n=sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(n);

        for(int i=0; i<n; i++){
            System.out.printf("Enter %d element :",i+1);
            arr.add(i,sc.nextInt());
        }
        System.out.println("Enter the number whose index you want to find :");
        int need=sc.nextInt();
        System.out.println(findingFirstIndexOf(arr,0,need));
        sc.close();
    }
    public static int findingFirstIndexOf(ArrayList<Integer> arr, int k,int need){
        if(k==arr.size()-1){
            if(arr.get(k)==need)
                return k+1;
            else
                return -1;
        }
        int ans=findingFirstIndexOf(arr,k+1,need);
        if(arr.get(k)==need)
            ans=k+1;
        return ans;
    }
}
