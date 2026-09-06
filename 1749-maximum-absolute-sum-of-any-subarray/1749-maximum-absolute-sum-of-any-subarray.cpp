class Solution {
public:
    int maxAbsoluteSum(vector<int>& nums) {
        
        int maxSum = nums[0];
        int minSum = nums[0];

        int ans = abs(nums[0]);

        for (int i=1; i<nums.size();i++){

            int prevMax = maxSum;
            int prevMin = minSum;

            maxSum = max(nums[i], prevMax+nums[i]);

            minSum = min(nums[i], prevMin+nums[i]);

            ans = max( ans , max(abs(maxSum), abs(minSum)));
        }

        return ans;
    }
};