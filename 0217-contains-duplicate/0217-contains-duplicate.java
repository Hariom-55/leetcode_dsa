class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        //Hashset to store elements 

        HashSet<Integer> seenNumbers = new HashSet<>();

        for (int num : nums)
        {
            if(seenNumbers.contains(num))
            {
                return true; // duplicate found
            }

            seenNumbers.add(num);
        }

        return false; //no duplicates found
    }
}