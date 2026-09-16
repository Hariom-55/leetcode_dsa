class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] result = new int[nums.length];

        int preProduct = 1; // Product of elemnts before i 
        int postProduct = 1; // Product of elements after i

        for(int i = 0; i<nums.length; i++)
        {
            result[i] = preProduct;
            preProduct = nums[i]* preProduct;
        }

        for (int i = nums.length-1; i >=0; i--)
        {
            result[i] = result[i]*postProduct;

            postProduct = nums[i] * postProduct;
        }

        return result;
    
        
    }
}