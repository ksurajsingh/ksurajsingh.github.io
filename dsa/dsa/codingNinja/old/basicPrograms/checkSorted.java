package basicPrograms;

import java.util.ArrayList;
import java.util.Scanner;
//?Function to find if a given set of numbers is sorted or not
public class checkSorted{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array :");
        int n=sc.nextInt();
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            System.out.printf("Enter %d element",i+1);
            arr.add(i,sc.nextInt());
        }
        if(actualCheck(arr,0))
            System.out.println("In Ascending Order");
        else
            System.out.println("Not in Ascending order");
        sc.close();
    }
    public static boolean actualCheck(ArrayList<Integer> arr,int n){
        if(n==arr.size()-1)
            return true;
        boolean temp=actualCheck(arr, n+1);
        if(temp==false)
            return false;
        else{
            if(arr.get(n)<=arr.get(n+1))
                return true;
            else
                return false;
        }
    }
}