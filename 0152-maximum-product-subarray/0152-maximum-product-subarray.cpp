class Solution {
public:
    int maxProduct(vector<int>& nums) {
        
        int maxProduct = nums[0]; // consider positive product
        int minProduct = nums[0]; //case for neg * neg

        int ans = nums[0];

        for (int i = 1; i < nums.size(); i++)
        {
            int op1 = nums[i];
            int op2 = maxProduct * nums[i];
            int op3 = minProduct* nums[i];

            // updating min and max at index i 
            int newMax = max(op1, max(op2, op3));
            int newMin = min(op1, min(op2, op3));

            maxProduct = newMax;
            minProduct = newMin;

            // updating the result at index i 

            ans = max( ans , max(maxProduct, minProduct));

            
        }

        return ans;
    }
};