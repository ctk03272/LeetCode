class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[2];
        //change something
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                if ( i != map.get(target - nums[i])) {
                    answer[0] = i;
                    answer[1] = map.get(target - nums[i]);
                    break;
                }
            }
         map.put(nums[i], i);
        }
        return answer;
        
    }
}
