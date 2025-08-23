package basicPrograms;

import java.util.HashMap;
import java.util.Scanner;
//? Given a SET of Pairs, This program only returns the unique pairs without any duplicates
public class uniquePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of pairs :");
        int n = sc.nextInt(),x,y,temp;
        HashMap<String,Integer> hs = new HashMap<String,Integer>();
        for(int i=0;i<n;i++){
            System.out.printf("In pair %d",i+1);
            System.out.printf("\nEnter 1st number :");
            x=sc.nextInt();
            System.out.printf("Enter 2nd number :");
            y=sc.nextInt();
            if(hs.containsKey(x+""+y)){
                temp=hs.get(x+""+y);
                hs.put(x+""+y,temp+1);
                hs.remove(y+""+x);
            }else
                hs.put(x+""+y,1);
                hs.remove(y+""+x);

        }
        System.out.println(hs.keySet());
        sc.close();
    }

}
