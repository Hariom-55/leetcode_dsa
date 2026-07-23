class Solution {
public:
    int longestOnes(vector<int>& nums, int k) {
        int n=nums.size();
        int low=0;
        int answer=0;
        int zeroes=0;

        for(int high=0;high<n;high++){
            
            if(nums[high]==0){
                zeroes++;
            }

            while(zeroes>k){
                if(nums[low]==0){
                    zeroes--;
                }
                low++;
            }
            int len = high-low+1;
            answer = max(answer,len);
        }

        return answer;
    }
};