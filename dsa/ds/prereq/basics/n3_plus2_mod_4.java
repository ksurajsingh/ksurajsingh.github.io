//package progs; 

import java.util.Scanner;

public class n3_plus2_mod_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        int var;
        for(int i=0,j=0;i<=n;j++){
            if((var=3*j+2)%4==0){
                continue;
            }
            System.out.print(var+" ");
            i++;
        }
        sc.close();
    }
}

