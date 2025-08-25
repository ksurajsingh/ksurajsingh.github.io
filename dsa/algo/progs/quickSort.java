
public class quickSort{



  public static int partition(int[] a,int s,int e){
    int pe=a[s];
    int count=0;
    for(int i=s+1;i<=e;i++){
      if(a[i]<pe) count++;
    }

    int temp=a[s+count];
    a[s+count]=pe;
    a[s]=temp;

    int i=s,j=e;
    while(i<j){
      if(a[i]<pe) i++;
      else if(a[j]>=pe)j--;
      else {
        temp=a[j];
        a[j]=a[i];
        a[i]=temp;
        i++;
        j--;
      }
    }

    return s+count;

    
  }


  public static void quickSort(int[] a,int s,int e){

    if(s>=e) return ;

    int pe=partition(a,s,e);
    quickSort(a,s,pe-1);
    quickSort(a,pe+1,e);
  }

  public static void main(String args[]){
    int a[]={6,8,5,54,6,5,2,58,5};
    quickSort(a,0,a.length-1);
    for (int var : a) {
        System.out.print(var+" ");
    }
    


  }

}
