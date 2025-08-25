public class replaceChar{


  public static String replaceChar(String str,char x,char y,int si){
    if(si==str.length()) return "";
    char current = str.charAt(si) == x ? y : str.charAt(si);
    return current+replaceChar(str,x,y,si+1);
  }


  public static void main(String args[]) {
    String str="waurlorurdu";
    System.out.println(replaceChar(str,'u','x',0));
  }
}
