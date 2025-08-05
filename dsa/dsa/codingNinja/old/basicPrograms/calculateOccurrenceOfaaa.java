package basicPrograms;

import java.util.Scanner;
//?Function to find the frequency of occurrence of 'aaa' in the given String
public class calculateOccurrenceOfaaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word  :");
        String word=sc.next();
        System.out.println(countaaa(word,0));
        sc.close();
    }
    public static int countaaa(String word,int n){
        if(n>=word.length()-2)
            return 0;
        int temp=countaaa(word, n+3);//# if you don't want to overlap just add 3 to n , if you want to overlap add 1 to n
        if(word.charAt(n)=='a' && word.charAt(n+1)=='a' && word.charAt(n+2)=='a' )
            return temp+1;
        else
            return temp;
    }
}
