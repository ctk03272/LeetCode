package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] input = { 3, 3 };
        Arrays.stream(twoSum(input, 6)).forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[2];
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            map.put(nums[i], i);
            int computedTarget = target - nums[i];
            if (map.containsKey(computedTarget)) {
                int a = i;
                int b = map.get(computedTarget);
                if (a != b) {
                    answer[0] = a;
                    answer[1] = b;
                    break;
                }
            }
        }
        return answer;
    }
}
