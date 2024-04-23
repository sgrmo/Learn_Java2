package AllProgramsInJava;

public class CheckStringPalindrome
{
    public static void main(String[] args) {
        String a = "madom";
        String rev = "";
        char [] b = a.toCharArray();

        for(int i=a.length()-1; i>=0; i--)
        {
            rev = rev + b[i];
        }
        if(a.equals(rev))
        {
            System.out.println("given string is palindrom");
        }
        else
        {
            System.out.println("given string is not palindrom");
        }
    }
}
