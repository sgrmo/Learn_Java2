package veljavaprograms;

public class SwapTwoNumbers
{
    public static void main(String[] args) {

        int a = 10;
        int b=20;

        System.out.println( "a : " + a+ " b : "+b);
        int c = a;
        a =b;
        b=c;

        System.out.println( "a : " + a+ " b : "+b);
    }
}
