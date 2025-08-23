package basicPrograms;

public class pre_post_Incre_decre {
//? to show the precedence and difference of pre and post increment operators
    public static void main(String[] args) {
        int a=10,b,c,d;
        b= ++a;
        System.out.println(a+"\n"+b);
        c=10;
        d=c++;
        System.out.println(c+"\n"+d);
    }
}
