package basicPrograms;

import java.util.Scanner;
//? program to find non perfect square root
public class perfectSQRT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose SQRT you want to find: ");
        int n =sc.nextInt(),ans=0;
        sc.close();
        for(int i=0;i*i<=n;i++){//*Given any number if not divisble by its the numbers within its root
                                //*won't be divisible by any numbers after its root */
            ans=i;
        }
        System.out.println(ans);
    }

}
