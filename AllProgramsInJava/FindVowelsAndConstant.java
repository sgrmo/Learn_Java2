package AllProgramsInJava;

public class FindVowelsAndConstant
{
    public static void main(String[] args) {
        String a="selenium testing";

        char [] abc = a.toCharArray();

        int count=0;

        for (int i = 0; i < abc.length; i++) {

            char b = abc[i];

            if(b=='a' || b=='e' || b=='i' || b=='o' || b=='u')
            {
                count++;
            }
        }

        System.out.println(count);

    }
}
