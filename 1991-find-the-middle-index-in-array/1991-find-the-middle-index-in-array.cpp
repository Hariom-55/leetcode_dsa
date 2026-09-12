class Solution {
public:
    int findMiddleIndex(vector<int>& nums) {
        
        int leftSum = 0;
        int numsSum = 0;

        for (int i=0; i< nums.size(); i++)
        {
            numsSum += nums[i];
        }

        for (int i=0 ; i< nums.size(); i++)
        {
            int rightSum = numsSum - nums[i] - leftSum;

            if (leftSum == rightSum)
            {
                return i ; 
            }

            leftSum += nums[i];
        }

        return -1;
    }
};