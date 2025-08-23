package basicPrograms;
import java.util.Scanner;
//? prints fibonacci series until the given number
public class fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        sc.close();
        int[] fb_sr = new int[n];
        fb_sr[0]=0;
        fb_sr[1]=1;
        int l = 0;
        for( int i = 2;i<n;i++ ){
            fb_sr[i]=fb_sr[i-1]+fb_sr[i-2];
            if(fb_sr[i]>=n)
            break;
            l = i;
        }
        for(int i=0;i<=l;i++){
            System.out.print(fb_sr[i]+" ");
        }
    }
}