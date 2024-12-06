class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> list = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            list.put(nums[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (list.containsKey(complement) && list.get(complement) != i) {
                return new int[]{i, list.get(complement)};
            }
        }
        
        return null;
    }
}
