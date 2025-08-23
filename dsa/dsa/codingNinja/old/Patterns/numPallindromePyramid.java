package Patterns;

import java.util.Scanner;
//? Prints 2 patterns of number pallindrome pyramid with different center values
public class numPallindromePyramid {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n,pn,opt;

            boolean again=true;

            while(again){

                System.out.println("Enter the number of rows");
                n= sc.nextInt();

                System.out.println("Enter the pattern number\n 1.Centers lineth number \t 2.Centers '1' ");
                pn=sc.nextInt();

                if(pn==1){

                    System.out.println("# # # Pattern 1 # # #");

                    for (int i = 0; i < n; i+=2) {
                        int num=1;

                        for (int j = 0; j < n - i; j++) {//# printing left spaces(Initials)
                            System.out.print(" ");
                        }

                        for (int j = 0; j <= i; j++) {

                            System.out.print(num + " ");//# Printing main numbers

                            // if (i < 5)
                            //     System.out.print(" ");//# conditional spaces

                            if(j<i/2)
                                num++;
                            else
                                num--;
                        }
                        System.out.println();
                    }
                }

                if(pn==2){

                    System.out.println("# # #  Pattern 2 # # #\n");

                    for(int i=0;i<n;i++){
                        int num=i+1;

                        for(int j=0;j<(n*3)-(i*2);j++){ //# Printing left indented spaces

                            if(i>=9){
                                if(j==0){
                                    for(int k=0;k<=(i-9);k++){
                                        j++;
                                    }
                                }
                            }
                                System.out.print(" ");
                        }


                        for(int j=0;j<=i*2;j++){//# Printing main numbers


                                System.out.print(num+" ");


                            if(j>=i)
                                num++;
                            else
                                num--;
                    }
                    System.out.println();
                }
            }
            System.out.println("do you want to print again?\n1.yea\t2.No");
            opt= sc.nextInt();
            if(opt == 2)
                again = false;
        }
        sc.close();
    }
}