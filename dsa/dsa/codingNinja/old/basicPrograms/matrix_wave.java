package basicPrograms;

//? Printing a matrix in wave form */
public class matrix_wave {
    public static void main(String[] args) {

        int[][] arr =new int[5][5];
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length;j++){
                arr[i][j]=count;
                count++;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                for(int j=0; j<arr.length;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=(arr.length-1); j>=0; j--){
                    System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
    }
}
}
