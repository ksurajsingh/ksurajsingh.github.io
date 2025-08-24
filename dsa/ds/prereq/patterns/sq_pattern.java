// package progs;

public class sq_pattern{
    public static void main(String[] args) {
        int i=0,j,var=1;
        while(i<4){
            j=0;
            while(j<4){
                System.out.print(var);
                j++;
            }
            var++;
            i++;
            System.out.println("");
        }

        System.out.println("\n\n***************\n\n");
        
        
        i=0;
        while(i<4){
            var=1;
            while(var<5){
                System.out.print(var);
                var++;
            }
            i++;
            System.out.println("");
        }

        
        System.out.println("\n\n***************\n\n");

        i=0;
        while(i<4){
            var=4;
            while(var>0){
                System.out.print(var);
                var--;
            }
            i++;
            System.out.println("");
        }



    }
}


