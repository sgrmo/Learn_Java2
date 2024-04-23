package javaProgarmsByPramod;

public class PalindromeNumber
{

    public static void main(String[] args) {
        if (isPalindrom(123))
        {
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("not palindrom");
        }
    }

    public static boolean isPalindrom( int n)
    {
        if(n<0)
        {return false;}



        int rev=0;
        int original = n;

            while (n>0)
            {
                int temp = n%10;
                rev = rev * 10 +temp;
                n = n/10;
            }
        return rev == original;
    }
}
