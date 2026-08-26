class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        
        if(nums.empty())
        {
            return 0;
        }

        unordered_set<int> s(nums.begin(), nums.end());

        int maxLength = 1;

        for (int num : s)
        {
            if (s.find(num-1) == s.end())
            {
                int current = num;
                int length = 1;

                while(s.find(current+1) != s.end())
                {
                    current++;
                    length++;
                }
                maxLength = max(length, maxLength);
            }
        }

        return maxLength;

    }
};