class test{
  public static void main(String[] args) {
      //This is how programmers normally print .
       normalPrint();

       // when you want to use 2 data types for the same variable
       implicitConvert();

       explicitConvert();

       // when you know the exact data type required throughout the program 
       directConvert();

 
      // Most commong approach to use another datatype if printing is the desired function
      // something that a 1000x dev use 

       bestApproach();      

       // special case - A rare error
       
       printAsBoolean();



  }

  public static void normalPrint() {
    int one=1;
    char two='a';
    System.out.println("This is how you normally print : \n "+one+" "+two);
  }

  public static void implicitConvert() {
    int one = 1;
    // when I want to use this value as both int and double - as a beginner
    double two = one ;
    System.out.println("\nImplicit Conversion: \n"+one +" "+two);

    // implicit conversion while demo - that's when things break right ?
    //comment out the next 3 lines of code if learnning

    //double char1 = 5;
    //int char2 = char1;
    //System.out.println("\n[Client Demo] Implicit Conversion: \n"+char1+" "+char2);

    // as double is 8 bytes in size and int is 4 bytes in size there would be a lossy conversion is what the compiler says and terminates the compilation. 
    // The fix to this is explicit conversion
  }
  public static void explicitConvert() {

    // Let us now avoid the error we get
    // senior version of conversion as a senior would have experienced lots of client demos
     
    double char1=5;
    int  char2=(int)char1;
    // now don't misunderstand 
    // before it wan't explicit though you mentioned char2 as int type because char 1 was a double a . 
    // you work was propoer with char2 - it was an int from the beginning to the end ,
    // but the variable you wanted to store in it wasn't . So now we just converted "CHAR1"
    
    System.out.println("\n[Senior version]Explicit conversion: \n"+char2);

  }
  public static void directConvert() {
  
    // now if you want to store something and store is as a different data type for various reasons like storage space or function operators on it 
    // you can always do something like this if you know that you won't be changing the data type
    
    double dou= 'a';
    System.out.println("Direct conversion: \n"+dou);
    // this prints the ASCII value of the character but you can always have the og character from its ascii value 
    //
    char asc=97; // just to test my demo
    //[so you can convert]
    char dou2=(char)dou;
    System.out.println("\nprinting character from ascii value: \n"+asc+"\n "+dou2);
  }
 
  public static void bestApproach() {
    double dou='a';
    System.out.println("\n Printing a double as a character [97.0]: \n"+(char)dou);
    System.out.println("\nPrintng a double as a integer [97.0]: \n"+(int)dou);
  }

  public static void printAsBoolean() {
   // a special case
   double dou= 'a';
   System.out.println("\nLets see a special case , og value: \n"+dou);

   //System.out.println("\n tring to print as a boolean "+(boolean)dou);

   // now this isn't a lossy conversion , it just won't convert 
   // well actually you can use boolena it , normally takes it as a "true" percenption for anything that isn't 1 .for ex: in a if loop give an integer and it shall take it as true in a few languaes like bash 
   
  }

}
