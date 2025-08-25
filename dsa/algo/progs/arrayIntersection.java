public class arrayIntersection{


  public static int arrayIntersect(int[] a,int[] b){
    for(int i=0;i<a.length;i++){
      for(int j=i+1;j<b.length;j++){
        if(a[i]==b[j]) return a[i];
      }
    }
    return -1;
  }



  public static void main(String args[]){

    int a[]={6,8,5,54,6,5,2,58,5};
    int b[]={1,2,3,2,1,54,6,5,2,58,5};
    System.out.println(arrayIntersect(a,b));
  }
}
