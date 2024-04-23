package AllProgramsInJava;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateWords
{
    public static void main(String[] args) {

        String a = "java selenium java testing selenium java";

        String [] abc = a.split(" ");

        HashMap<String, Integer> hs = new HashMap<String, Integer>();

        for (int i = 0; i < abc.length; i++) {

            if (hs.containsKey(abc[i])) {
                hs.put(abc[i], hs.get(abc[i]) + 1);
            } else {
                hs.put(abc[i], 1);
            }
        }

        for (Map.Entry<String, Integer> b : hs.entrySet()) {
            //System.out.println(b.getKey() + " : " + b.getValue());

            if (b.getValue() > 1) {
                System.out.println(b.getKey() + " : " + b.getValue());

            }

            if (b.getValue() > 1) {
                System.out.println(b.getKey());

            }

        }
    }
}
