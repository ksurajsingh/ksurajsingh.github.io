// FORWARD REFERENCE IS ALLOWED IN JAVA

class fwdref{
  public static void main(String[] args) {
    int num = 1;
    one(num);
  }

  public static void one(int num){
          num--;
          two(num); // this isn't initialised at the moment therefore you are calling it before
  }
  public static void two(int num){
              num++;
             System.out.println(num); 
  }
}
