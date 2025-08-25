public class mergeSort{


  public static void merge(int[] a,int[] b,int[] c){
    int i=0,j=0,k=0;
   while(i<a.length && j<b.length){

      if(a[i]<b[j]){
        c[k]=a[i];
        k++;
        i++;
      }else{
        c[k]=b[j];
        k++;
        j++;
      }

    }
    while(i<a.length-1){
      c[k]=a[i];
      k++;
      i++;
    }
    while(j<b.length-1){
      c[k]=b[j];
      k++;
      j++;
    }

  }


  public static void mergeSort(int[] a){
    
       if(a.length<=1) return ;

       int b[] = new int[a.length/2];
       int c[] = new int[a.length-b.length];

       for(int i=0;i<a.length/2;i++) b[i]=a[i] ;
       for(int i=a.length/2;i<a.length;i++) c[i-a.length/2]=a[i];
      
       mergeSort(b);
       mergeSort(c);
       merge(b,c,a);
       
  }
    
  public static void main(String args[]) {
    int a[]={6,8,5,54,6,5,2,58,5};
    mergeSort(a);
    for (int var : a) {
        System.out.println(var+" ");
    }
    
  }
}
