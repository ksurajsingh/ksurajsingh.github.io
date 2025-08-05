package basicPrograms;

import java.util.*;;
//? Program finds the pair in the given list of numbers whose sum is the asked number
public class checkPairSums {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers :");
        int n = sc.nextInt();
        ArrayList<Integer> arr= new ArrayList<Integer>();
        System.out.println("Enter the sum you want to find :");
        int k=sc.nextInt(),temp;

        for(int i=0;i<n;i++){
            System.out.printf("Enter %d number :",i+1);
            arr.add(i,sc.nextInt());
        }
        //# got the array

        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr.get(i))){
                temp=hm.get(arr.get(i));
                hm.put(arr.get(i),temp+1);
            }else{
                hm.put(arr.get(i), 1);
            }
        }

        System.out.println(actualCheck(n, k, arr, hm));

        sc.close();
    }

    public static HashSet<String> actualCheck(int n,int k,ArrayList<Integer> arr,HashMap<Integer,Integer> hm){
        int a,b;
        HashSet<String> hs= new HashSet<String>();
        for(int i=0;i<n;i++){
            a=arr.get(i);
            b=k-a;

            if(a!=b && hm.containsKey(b)){
                hs.add(i+""+arr.indexOf(b));
                hs.remove(arr.indexOf(b)+""+i);
            }
            if(a==b && (hm.get(b)>1)){
                hs.add(i+""+arr.indexOf(b));
                hs.remove(arr.indexOf(b)+""+i);
            }
        }
        return hs;
        // return false;

        //# TRYING TO GET ONLY UNIQUE PAIRS TO BE SHOWN
        //?SUCCESSEDED
    }
}