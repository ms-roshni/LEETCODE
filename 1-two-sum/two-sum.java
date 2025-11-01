class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];
            
            if (hm.containsKey(required)) {
                return new int[]{hm.get(required), i};
            }
            hm.put(nums[i], i);
        }
        return new int[]{}; // no pair found
    }
}
