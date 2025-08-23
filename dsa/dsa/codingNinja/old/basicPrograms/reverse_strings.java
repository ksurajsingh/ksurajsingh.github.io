package basicPrograms;

import java.util.Scanner;
//? To reverse a given String */
public class reverse_strings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter :");
        String st = sc.nextLine();
        sc.close();
        char[] c = st.toCharArray();
        int sp=0,ep=c.length-1;
        char temp='0';
        while(sp<ep){
            temp=c[sp];
            c[sp] = c[ep];
            c[ep] = temp;
            sp++;
            ep--;
        }
        System.out.println(c);
    }
}
