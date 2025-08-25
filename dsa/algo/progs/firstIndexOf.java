public class firstIndexOf{

    public static int lastIndexOf(String str,char c,int si){
        if(str.charAt(si)==c) return si;
        return lastIndexOf(str,c,si-1);
    }



  public static int firstIndexOf(String str,char c,int si){
    if(str.charAt(si)==c) return si;
    return firstIndexOf(str,c,si+1);
  }

  public static void main(String args[]) {
    String str=("waurlorurdu");
    System.out.println(firstIndexOf(str,'u',0)+1);
    System.out.println(lastIndexOf(str,'u',str.length()-1)+1); // + 1 for just H format
  }
}
