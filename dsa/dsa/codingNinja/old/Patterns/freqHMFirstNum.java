package Patterns;
import basicPrograms.HaashMapFreq;
import java.util.ArrayList;
import java.util.Scanner;

//? Print the first number that has only a single occurence using hashmap

public class freqHMFirstNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();

        ArrayList<Integer> arr= new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the %d element :", i + 1);
            arr.add(sc.nextInt());
        }

        //# got the array
        HaashMapFreq.fHM(arr, arr);
        sc.close();

    }
}
