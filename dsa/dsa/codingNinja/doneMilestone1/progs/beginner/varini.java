class varini{
  public static void main(String[] args) {
   
    withoutInit();
    withInit();
    nullInit();
    withoutDec();

  }

  public static void withoutInit() {
     int a;
    //System.out.println("%d"+a); // in order to remove garbage value , this won't even compile - it just says uninitialised

  }

  public static void withInit() {
        int b=10;
    System.out.println("\n"+b);
   
  }

  public static void nullInit() {
    //int c=NULL; // not possible you need to use a wrapper class
    //System.out.println("%d",c);

  }

  public static void withoutDec() {
    //System.out.println("%d",+hakuna);
    
  }
}
