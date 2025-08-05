package basicPrograms;

import java.util.Scanner;
//? Printing the difference between the ASCII values in the given string */
public class ascii_difference_bw_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter :");
        int temp=0;
        String ans="",st=  sc.next();
        sc.close();
        for(int i=0;i<(st.length()-1);i++){
            ans = ans + st.charAt(i);
            temp=(int)((st.charAt(i+1))-(st.charAt(i)));
            //System.out.println(temp);//#checks the difference in every iteration
            ans= ans+temp;
        }
        ans=ans+st.charAt(st.length()-1);
        System.out.println(ans.toCharArray());

    }
}
