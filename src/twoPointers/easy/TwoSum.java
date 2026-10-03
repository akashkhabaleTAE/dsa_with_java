package twoPointers.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] array = new int[] {2,5,6,9};
        int target = 14;
        int[] indices = findTwoSum(array, target);
        String result = Arrays.toString(indices);
        System.out.println("Result: " + result);
    }

    private static int[] findTwoSum(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++){
            int complement = target - array[i];
            if (map.containsKey(complement))
                return new int[]{i, map.get(complement)};
            map.put(array[i], i);
        }
        return new int[] {};
    }
}
