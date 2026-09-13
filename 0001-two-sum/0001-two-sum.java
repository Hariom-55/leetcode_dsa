class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // creating Hash Map 
        Map<Integer, Integer> map = new HashMap<>();

        //iterating 
        for (int i=0; i<nums.length; i++)
        {
            int required_num = target - nums[i];

            if (map.containsKey(required_num))
            {
                return new int[] {map.get(required_num) , i};
            }

            map.put(nums[i], i);
        }

        return new int[] {};

    }
}