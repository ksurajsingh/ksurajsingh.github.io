package basicPrograms;

import java.util.*;
//? Calculates the frequency of the given numbers
public class HaashMapFreq {
    public static HashMap<Integer,Integer> fHM(ArrayList<Integer> arr, ArrayList<Integer> queries) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int num : arr) {
            if (hm.containsKey(num)) {// # checking if the HashMap contains the query
                int temp = hm.get(num);
                hm.put(num, temp + 1);// # increments the vlaue by 1
            } else {
                hm.put(num, 1);// # if it doesn't contain the query if generated in the hashmap with a initial
                               // value of 1
            }
        }
        for (int num : queries) {
            if (hm.containsKey(num) == true) {
                System.out.printf("The frequency of %d element is : %d\n", num, hm.get(num));
            } else {
                System.out.println("0");
            }
        }
        return hm;
    }

}
