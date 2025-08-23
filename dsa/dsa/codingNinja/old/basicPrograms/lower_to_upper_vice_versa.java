package basicPrograms;

import java.util.Scanner;
//? given a string - change its Capital to small letters and viceversa
public class lower_to_upper_vice_versa {
    public static void main(String[] args) {
        String st= new String();
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter :");
        st=sc.nextLine();
        sc.close();
        char[] arr = st.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=65 && arr[i]<=90){
                arr[i]=(char)(arr[i]+32);//! the difference between the ascii value of capital and lower case letters is 32
            }
            else
                arr[i]=(char)(arr[i]-32);
        }
        System.out.println(arr);
    }

}
