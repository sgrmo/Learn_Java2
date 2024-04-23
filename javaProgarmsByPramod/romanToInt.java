package javaProgarmsByPramod;

import java.util.HashMap;
import java.util.Map;

public class romanToInt
{
    public static void main(String[] args) {
        int a = romanToInt("XVII");
        System.out.println(a);
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentVal = values.get(s.charAt(i));
            int nextVal = (i < s.length() - 1) ? values.get(s.charAt(i + 1))
                    : 0;
            if (currentVal < nextVal) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }
        return result;
    }
}
