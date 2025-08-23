package basicPrograms;
import java.util.*;

public class togglecharacter {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String st=scn.nextLine();scn.close();
        int n = st.length();

        char[] arr = new char[n];
        for(int i=0;i<n;i++){
            if(st.charAt(i)>='A' && st.charAt(i)<='Z'){
                arr[i] = (char)(st.charAt(i) + 32);
            }else{
                arr[i] = st.charAt(i);
            }
        }

        int sp = 0;
        int ep = n-1;

        while(sp<ep){
            if(arr[sp]!= arr[ep]){
                System.out.println("false");
                return;
            }

            sp++;
            ep--;
        }

        System.out.println("true");
    }
}
