package basicPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
//? Given a set of number this program prints the number of distinct numbers present there using both HashMap and HASHSET
public class distinctNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers :");//#in-order to iterate throught the hashmap
        int n=sc.nextInt();

        System.out.println("Which way do you want to calculate the distinct number \n 1.HashMap \t2.HashSet \t3.Both");
        int opt=sc.nextInt();

        switch(opt){
            case 1: hashmapToFindDistinctNums(n, sc);
                    break;

            case 2: hashsetToFindDistinctNums(n, sc);
            break;

            case 3: hashmapToFindDistinctNums(n, sc);
            hashsetToFindDistinctNums(n, sc);
            break;
        }

        sc.close();
    }

    //# Using HasMap
    public static void hashmapToFindDistinctNums(int n,Scanner sc){
        System.out.println("\n***Using HashMap ***");

        HashMap<Integer,Integer> list = new HashMap<Integer, Integer>();
        int num,temp;

        for(int i = 0; i <n;i++){
            System.out.printf("Enter the %d number :",i+1);
            num=sc.nextInt();
            if(list.containsKey(num)){
                temp=list.get(num);
                list.put(num, temp+1);
            }else{
                list.put(num,1);
            }
        }
        System.out.println("\n"+list);
        System.out.println("\nThe number of distinct numbers is "+ list.size());
    }

    //# Using HashSet
    public static void hashsetToFindDistinctNums(int n,Scanner sc){
        System.out.println("\n***Using HashSet ***");

        HashSet<Integer> set = new HashSet<Integer>();
        int num;

        for (int i=0; i<n; i++){
        System.out.printf("Enter the %d number :",i+1);
        num = sc.nextInt();
        set.add(num);
        }

        System.out.println("\n"+set);
        System.out.println("\n"+set.size());
    }

}
