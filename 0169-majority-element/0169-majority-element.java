class Solution {
    private static Map<Integer, Integer> countNums(int [] nums)
    {
        Map<Integer, Integer> counts = new HashMap<>(); 

        for(int n : nums)
        {
            if(!counts.containsKey(n))
            {
                counts.put(n , 1);
            }
            else {
                counts.put(n , counts.get(n)+1);
            }
        }

        return counts;
    }
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> count = countNums(nums);

        Map.Entry<Integer,Integer> majorityEntry = null;

        for(Map.Entry<Integer, Integer> entry: count.entrySet())
        {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue())
            {
                majorityEntry = entry;
            }
        }

        return majorityEntry.getKey();
    }
}