class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int left = 0 ; //storing the prefix sum 
        int sum = 0;

        for (int i = 0; i<nums.size() ; i++)
        {
            sum += nums[i];
        }

        for (int i=0; i < nums.size(); i++)
        {
            int right = sum - nums[i] - left;

            if (left == right)
            {
                return i;
            }

            left += nums[i];
        }

        return -1;
    }
};