package basicPrograms;

import java.util.Arrays;
import java.util.Scanner;
//?Given the set of numbers , Funtion to find the minimum cost of removal of the elements one by one,,
//? cost of removal = sum of number of all the elements present at the time of removal
public class elementRemovalAndArrayCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {   
            System.out.printf("Enter %d element :", i + 1);
            array[i] = sc.nextInt();
        }
        System.out.println(findingCost(array, n));
        sc.close();
    }

    public static int findingCost(int[] array, int n) {
        n = array.length;
        Arrays.sort(array);
        for(int number: array){
            System.out.printf("\nnumber :%d",number);
        }
        int cost = 0;
        for (int i = 0; i < array.length; i++) {
            int temp = array[i] * (n - i);
            cost = cost + temp;
        }
        return cost;
    }
}
