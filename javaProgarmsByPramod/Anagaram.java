package javaProgarmsByPramod;

import java.util.Arrays;

public class Anagaram {
    public static void main(String[] args)
    {

        boolean b = isAnagram("s12ilent", "lis3ten");

        if(b)
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }

        // my implementation

//        String s1 = "kate";
//        String s2 = "Take";
//
//        //System.out.println(s1.replaceAll("[^a-zA-Z]", ""));
//        boolean isAnagram = true;
//        if(s1.length()==s2.length())
//        {
//            s1.toLowerCase();
//            s2.toLowerCase();
//            char [] a = s1.toCharArray();
//            char [] b = s2.toCharArray();
//
//            Arrays.sort(a);
//            Arrays.sort(b);
//
//            for(int i=0; i<a.length; i++)
//            {
//                if(a[i] != b[i])
//                {
//                    isAnagram = false;
//                }
//            }
//
//        }
//
//        System.out.println(isAnagram);
    }

    public static boolean isAnagram(String s1, String s2)
    {
        // Remove non-letter characters and convert to lowercase
        s1 = s1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        s2 = s2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        if(s1.length() != s2.length())
        {
            return false;
        }

        char [] arr1 = s1.toCharArray();
        Arrays.sort(arr1);

        char [] arr2 = s2.toCharArray();
        Arrays.sort(arr2);

        for(int i=0; i<arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
