package AllProgramsInJava;

import java.util.Arrays;

public class Anagram
{
    public static void main(String[] args) {
        String a= "Race";
        String b = "Care";

        if(a.length() == b.length())
        {
             a = a.toLowerCase();
             b = b.toLowerCase();

            char [] c = a.toCharArray();
            char [] d = b.toCharArray();

            Arrays.sort(c);
            Arrays.sort(d);

            if(Arrays.equals(c, d))
            {
                System.out.println("Strings are Anagram");
            }
            else
            {
                System.out.println("Strings are not Anagram" );
            }
        }

    }
}
