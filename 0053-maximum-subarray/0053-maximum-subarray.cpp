class Solution {
public:
    int maxSubArray(vector<int>& nums) {

        int maxSum = nums[0];
        int ans = nums[0];
        for (int i = 1 ; i< nums.size(); i++)
        {
            int op1 = maxSum + nums[i];
            int op2 = nums[i];
            maxSum = max(op1, op2);

            ans = max(ans, maxSum);
        }

        return ans;
    
    }
};