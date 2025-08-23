package basicPrograms;

import java.util.ArrayList;
import java.util.Scanner;
//?prints the numbers which only has one occurance in the array */
public class single_occurance {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        System.out.println("Enter the length of array :");//Enter only in pairs and only one single number
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.printf("Enter %d element :",i+1);
            // arr.set(i,sc.nextInt()); you cannot set as there is NOTHING (the size being zero!)
            arr.add(sc.nextInt());

        }
        sc.close();
        //to check
        // for(int i=0;i<n;i++){
        //     System.out.printf("%d element : %d\n",i+1,arr.get(i));
        // }

        int ans=arr.get(0);
        for(int i=0;i<(arr.size()-1);i++){
            ans=ans^arr.get(i+1);
        }
        System.out.println(ans);
}

}