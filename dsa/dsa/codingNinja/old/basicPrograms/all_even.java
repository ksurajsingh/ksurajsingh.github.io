package basicPrograms;
import java.util.Scanner;
//? prints all even number till the given number
class all_even extends Thread
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);

            }
        }
    }


    // WHEN I TRIED MULTITHREADING FOR THE FIRST TIME


    //     // create 4 threads
    //     All_even t1 = new All_even();
    //     All_even t2 = new All_even();
    //     All_even t3 = new All_even();
    //     All_even t4 = new All_even();
    //     All_even t5 = new All_even();
    //     All_even t6 = new All_even();
    //     All_even t7 = new All_even();
    //     All_even t8 = new All_even();
    //     t1.start();
    //     // t2.start();
    //     // t3.start();
    //     // t4.start();
    //     // t5.start();
    //     // t6.start();
    //     // t7.start();
    //     // t8.start();
    // }
    // public void run()
    // {
    //     // System.out.println("Enter the number: ");
    //     // Scanner sc = new Scanner(System.in);
    //     // long n = sc.nextLong();
    //     // for (int i=1 ; i<=n ; i++)
    //     // {
    //     //     if (i%2==0)
    //     //     {
    //     //         System.out.println(i);
    //     //     }
    //     // }
    //     for (int i=1 ; i<=100 ; i++)
    //     {
    //        System.out.println(i);
    //     }
    // }
}