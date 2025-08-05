package basicPrograms;

//? Printing a matrix column vice */
public class matrix_column {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int count=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++){
                arr[i][j]=count;
                count++;
            }
        }
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }

    }
}
