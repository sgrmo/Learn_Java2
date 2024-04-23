package AllProgramsInJava;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateVowelsInString
{
    public static void main(String[] args) {

        String a = "cucumber a a e e o o";

        char[] abc = a.toCharArray();

        HashMap<Character, Integer> hs = new HashMap<Character, Integer>();

        for (int i = 0; i < abc.length; i++) {

            if (hs.containsKey(abc[i])) {
                hs.put(abc[i], hs.get(abc[i]) + 1);
            } else {
                hs.put(abc[i], 1);
            }
        }

        for (Map.Entry<Character, Integer> b : hs.entrySet()) {
            // System.out.println(b.getKey() + " : " + b.getValue());

            if (b.getValue() > 1) {
                //System.out.println(b.getKey() + " : " + b.getValue());
                char c = b.getKey();

                if(c=='a' ||  c =='e' || c=='i' ||  c=='o' || c=='i')
                {
                    System.out.println(b.getKey() + " : " + b.getValue());
                }
            }
        }

    }
}
