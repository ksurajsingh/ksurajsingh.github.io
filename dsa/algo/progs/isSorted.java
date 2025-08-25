import java.util.Arrays;

public class isSorted{


  public static boolean isSortedb(int a[],int si){
    if(si==a.length-1) return true;
    if(a[si]<=a[si+1]) return isSortedb(a,si+1);
    return false;

  }


  public static boolean isSorted(int a[]){
    if(a.length==1) return true;
    int sa[] = new int[a.length-1];
    for(int i=0;i<a.length-1;i++) sa[i] = a[i];
    isSorted(sa);
    if(a[a.length-2]<=a[a.length-1]) return true; 
    else return false;
      }


  public static void main(String args[]) {
    int a[]={6,8,5,54,6,5,2,58,5};
    System.out.println(isSorted(a));
    Arrays.sort(a);
    System.out.println(isSorted(a));
  }
}
