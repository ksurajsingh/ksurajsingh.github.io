package basicPrograms;

import java.util.Scanner;

public class isPallindromeUsingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word :");
        String word=sc.next();
        isPallindrome(word, 0 , (word.length()-1));
        sc.close();
    }
    public static void isPallindrome(String word, int sp, int endp){
        if(sp>=endp){
            System.out.println("is Pallindrome !");
            return;
        }
        if(word.charAt(sp)==word.charAt(endp)){
            isPallindrome(word, sp+1, endp-1);
        }
        else
            System.out.println("Not pallindrome");
    }
}
