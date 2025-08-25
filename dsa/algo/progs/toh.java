public class toh{



  public static void toh(int n,char s,char h,char d){
    if(n==1){
      System.out.println("Move disk "+n+" from "+s+" to "+d);
      return;
    }

    toh(n-1,s,d,h);
    System.out.println("move disk "+n+" from "+s+" to "+d);
    toh(n-1,h,s,d);
    return;

  }

  public static void main(String args[]){
    toh(3,'s','h','d');
  }
}
