package basicPrograms;

import java.util.Scanner;
//? Program to find wether the given string is Pallindrome or not */
public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter :");
        String n=sc.next(); boolean Pallindrome = false; int sp=0,ep=(n.length()-1);//advanced declaration
        sc.close();
        while(sp<ep){
            if(n.charAt(sp)==n.charAt(ep)){ // checks if the starting character is equal to the equivalent ending index from the last
                sp++;
                ep--;
                Pallindrome=true; // c i v i c
            }
            else{
                Pallindrome=false;
                sp++;
                ep--;
            }
        }
        if(Pallindrome)
            System.out.println("Pallindrome ");
        else
            System.out.println("Not Pallindrome");
    }
}
