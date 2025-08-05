package basicPrograms;

import java.util.HashMap;
import java.util.Scanner;
//? Program to print the possible number of right triangles in a graph given the coordinates
public class numsRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of co-ordinates :");
        int n=sc.nextInt(),num,temp;


        //# declaraing 2 hashmap to store for x and y coords
        HashMap<Integer,Integer> xcoords = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> ycoords = new HashMap<Integer,Integer>();

        for(int i=0;i<n;i++){
            System.out.printf("\ncoordinate %d",i+1);

            System.out.printf("\nEnter X-coodrinate :");
            num=sc.nextInt();

                if(xcoords.containsKey(num)){
                    temp=xcoords.get(num);
                    xcoords.put(num,temp+1);
                }else{
                    xcoords.put(num,1);
                }

            System.out.printf("Enter Y-coodrinate :");
            num=sc.nextInt();

                if(ycoords.containsKey(num)){
                    temp=ycoords.get(num);
                    ycoords.put(num,temp+1);
                }else{
                    ycoords.put(num,1);
                }
        }


        System.out.println(possibleRightTrianlgeCounts(xcoords,ycoords));

        sc.close();
    }

    static int possibleRightTrianlgeCounts(HashMap<Integer,Integer> xcoords,HashMap<Integer,Integer> ycoords){

        int possibleCounts = 0;
        for(Integer xkeys: xcoords.keySet()){
            int xCoordinates = xcoords.get(xkeys)-1;

            for(Integer ykeys: ycoords.keySet()){
                int yCoordinates = ycoords.get(ykeys)-1;
                possibleCounts += xCoordinates * yCoordinates;
           }
        }
        return possibleCounts;
    }
}
