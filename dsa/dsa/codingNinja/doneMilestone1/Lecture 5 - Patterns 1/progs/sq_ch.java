// package Lecture 5 - Patterns 1;

public class sq_ch {
   public static void main(String[] args) {
    int i=0,j;
    char var;
    while (i<4){
        j=0;
        var='A';
        while(j<=i){
            System.out.print(var+" ");
            var=(char)(var+1);
            j++;
        }
        i++;
        System.out.println("");
    }

    System.out.println("\n\n******************\n\n");

    i=0;
    while (i<4){
        j=0;
        var='A';
        while(j<4){
            System.out.print(var+" ");
            var=(char)(var+1);
            j++;
        }
        i++;
        System.out.println("");
    }


    System.out.println("\n\n******************\n\n");

    i=0;
    while (i<4){
        j=0;
        var=(char)('A'+i);
        while(j<4){
            System.out.print(var+" ");
            var=(char)(var+1);
            j++;
        }
        i++;
        System.out.println("");
    }

    System.out.println("\n\n******************\n\n");

    i=0;
    while (i<4){
        j=0;
        var=(char)('A'+i);
        while(j<=i){
            System.out.print(var+" ");
            var=(char)(var+1);
            j++;
        }
        i++;
        System.out.println("");
    }

    System.out.println("\n\n******************\n\n");

    i=4;
    while (i>=0){
        j=0;
        var=(char)('A'+i);
        while(j<=4-i){
            System.out.print(var+" ");
            var=(char)(var+1);
            j++;
        }
        i--;
        System.out.println("");
    }

   } 
}
