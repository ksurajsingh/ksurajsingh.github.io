public class right_triag {
    public static void main(String[] args) {
        int i=1,j;
        while(i<=4){
            j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println();
        }
        
        System.out.println("\n\n***************\n\n");
        
        i=1;
        int var=1;
        while(i<=4){
            j=1;
            while(j<=i){
                System.out.print(var+" ");
                var++;
                j++;
            }
            i++;
            System.out.println();
        }

        System.out.println("\n\n***************\n\n");
        
        i=1;
        var=1;
        while(i<=4){
            j=1;
            var=i;
            while(j<=i){
                System.out.print(var+" ");
                var++;
                j++;
            }
            i++;
            System.out.println();
        }

        System.out.println("\n\n***************\n\n");
        
        i=1;
        var=1;
        while(i<=4){
            j=1;
            var=i;
            while(j<=i){
                System.out.print(var+" ");
                //var++;
                j++;
            }
            i++;
            System.out.println();
        }

        System.out.println("\n\n***************\n\n");
        
        i=1;
        var=1;
        while(i<=4){
            j=1;
            var=i;
            while(j<=i){
                System.out.print(var+" ");
                var--;
                j++;
            }
            i++;
            System.out.println();
        }
    }   
}
