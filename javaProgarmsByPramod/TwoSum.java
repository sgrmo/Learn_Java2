package javaProgarmsByPramod;

import java.util.HashMap;
import java.util.Map;

public class TwoSum
{

    public static void main(String[] args) {
        int [] num = new int[]{5, 6, 7 , 8};

        int []  arr =  twoSum(num, 16);

        for (int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
