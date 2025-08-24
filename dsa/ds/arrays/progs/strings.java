public class test {
  public static void main(String[] args) {
    String str="abc def ghi jkl";
    //char str[]={"a","b","c"};
    //convert(str);
    //numSubStrings(str); // order - for one element print all
    System.out.println(); 
    //numSubStrings2(str); // order - for one length print all
    //System.out.println(str);
    reverseEachWord(str);
  }
  public static void convert(char str[]) {
      //str[]={"b","c","d"};    // only for test purpose
  }
  public static void numSubStrings(String str) {
    for (int start=0; start < str.length(); start ++){
      for(int end = start;end<str.length();end++){
        System.out.println(str.substring(start,end+1));
      }
    }
    
  }
  //public static void numSubStrings2(String str) {
  //   for(int len=1;len<=str.length();len++){
  //     System.out.println("\nFor length : "+len+"\n");
  //     for(int start=0;start<=str.length()-1;start++){
  //       int end=start+len-1;
  //       //System.out.print(start+" "+end);
  //       System.out.println(str.substring(start,end+1));
  //     }
  //   }
  //
  //}
  public static void numSubStrings2(String str) {
     for(int len=1;len<=str.length();len++){
       System.out.println("\nFor length : "+len+"\n");
       for(int start=0;start<=str.length()-len;start++){
         int end=start+len-1;
         //System.out.print(start+" "+end);
         System.out.println(str.substring(start,end+1));
       }
     }
    
  }
  public static void reverseEachWord(String str) {
  int start=0;
  String rev=" ";
  int i=0;
   for(;i<str.length();i++){
     if(str.charAt(i)==' '){
     String temp=" ";
       int end=i-1;
       for(int j=start; j<=end ; j++ ){
         temp = str.charAt(j) + temp;
       }
       start=i+1;
       rev = rev + temp + " ";
     }
   }
   // The following is for the last word , since it read "\n" and not " "
    String temp=" ";
    int end=i-1;
    for(int j=start; j<= end ; j++){
      temp= str.charAt(j)+temp;
    }
    rev=rev+temp;
   System.out.println(rev);
    
  }
}
