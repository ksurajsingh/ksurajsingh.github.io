import java.util.Scanner;

public class recursion2 {
  public static void main(String[] args) {

   //replaceChar();
   //replaceCharWithPi();
   //binSearch();
   //mergeSort();
   quickSort();
  }
  public static void quickSort() {
    System.out.println("Performing Quick sort: \n");
    int arr[]=takeArrInput();
    actualQuickSort(arr,0,arr.length-1);
    System.out.println("After Sorting: \n");
    for(int i=0;i<arr.length;i++){
      System.out.printf("%d ",arr[i]); 
    }
  }
  public static void actualQuickSort(int arr[], int si, int ei) {
    if(si>=ei){
      return;
    }
    int pivotE=partition(arr,si,ei);
    partition(arr,si,pivotE-1);
    partition(arr,pivotE-1,ei);
    
  }
  public static int partition(int arr[],int si,int ei) {
    int pivotE=arr[si];
    int smallC=0;    
    for(int i=0;i<arr.length;i++){
      if(arr[i]<pivotE){
        smallC++;
      }
    }
    int temp=arr[si+smallC];
    arr[si+smallC]=arr[si];
    arr[si]=temp;
    int i=si,j=ei;
    while(i<j){
      if(arr[i]<pivotE){
        i++;
      }
      if(arr[j]>pivotE){
        j--;
      }
      int temp2=arr[i];
      arr[i]=arr[j];
      arr[j]=temp2;
    }
  return si+smallC;
  }
  public static void mergeSort() {
    System.out.println("Performing merge sort: ");
    int arr[]=takeArrInput();

    actualMergeSort(arr);    
    System.out.println("After Sorting: \n");
    for(int i=0;i<arr.length;i++){
      System.out.printf("%d ",arr[i]); 
    }
    
  }
  public static void actualMergeSort(int arr[]) {
    if(arr.length<=1){
      return ;
    }    
    int b[]=new int[arr.length/2];
    int c[]=new int[arr.length-b.length];
    for(int i=0;i<arr.length/2;i++){
      b[i]=arr[i];
    }
    for(int i=arr.length/2;i<arr.length;i++){
      c[i-arr.length/2]=arr[i];
    }
    actualMergeSort(b);
    actualMergeSort(c);
    merge(b,c,arr);
  }
  public static void merge(int b[],int c[], int arr[]) {
    int i=0,j=0,k=0;
    while(i<b.length && j<c.length){
      if(b[i]<=c[j]){
        arr[k]=b[i];
        i++;
        k++;
      }
      else{
        arr[k]=c[j];
        j++;
        k++;
      }
    }
    while(i<b.length){
      arr[k]=b[i];
      i++;
      k++;
    }
    while(j<c.length){
      arr[k]=c[j];
      j++;
      k++;
    }
  }

  public static void binSearch() {
    System.out.println("\n Performing a binary Search\n ");
    int arr[]=takeArrInput();
    actualMergeSort(arr);
    System.out.println("\n After Sorting: \n");
    for(int i=0;i<arr.length;i++){
      System.out.printf("%d ",arr[i]);
    }
    System.out.println("\n Enter the element whose index you want: ");
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    int res=actualBinSearch(arr,n,0,arr.length-1);
    System.out.printf("\n The given element's index is found at: %d\n",(res+1));
    
  }
  public static int actualBinSearch(int arr[], int n, int s, int e) {
    if(s>e){
      return -2;
    }
    int mid=(e+s)/2;
    if(arr[mid]==n){
      return mid;
    }
    else{
      if(arr[mid]>n){
        return actualBinSearch(arr,n,s,mid-1);
      }
      else{
        return actualBinSearch(arr,n,mid+1,e);
      }
    }
    
  }
  public static int[] takeArrInput() {
    System.out.println("Enter the size of the array: ");
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      System.out.printf("\nEnter the element no %d: ",i+1);
      arr[i]=sc.nextInt();
    }
      System.out.println("\n Given array is : ");
    for(int i=0;i<n;i++){
      System.out.printf("\nThe element no %d: %d",i+1,arr[i]);
    }
    return arr;
    
  }
  public static void replaceCharWithPi() {
    Scanner si = new Scanner (System.in);
    System.out.println("\nReplacing \"pi\" with pi \n");
    System.out.println("Enter the string: ");
    String s = si.next();
    System.out.println("original string: "+s);
    System.out.println("After replacing PI : "+piReplaced(s));
    
  }
  public static String piReplaced(String s) {
    if(s.length()<=1){
      return s;
    }
    if(s.charAt(0)=='p' && s.charAt(1)=='i'){
      return " 3.14 "+piReplaced(s.substring(2));
    }
    else{
      return s.charAt(0)+piReplaced(s.substring(1));
    }
    
  }
  public static void replaceChar() {
    Scanner sc = new Scanner(System.in);
    System.out.println("\n Replacing a specified character with another specified character\n");
    System.out.println("Enter the string: ");
    String s=sc.next();
    System.out.println("replace what?: ");
    char a=sc.next().charAt(0);
    System.out.println("with what?: ");
    char b=sc.next().charAt(0);
   System.out.println("Original String: "+s);   
   System.out.println("After replacing: "+replaceChatAt(s,a,b));
  }
  public static String replaceChatAt(String s, char a,char b) {
    if(s.length()==0){
      return s;
    }
    String temp = replaceChatAt(s.substring(1),a,b);
    if(s.charAt(0)==a){
      return b+temp;
    }
    else{
      return s.charAt(0)+temp; 
    }
    
  }
}
