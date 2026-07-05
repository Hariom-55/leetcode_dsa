class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> res;
        int i=0;
        sort(nums.begin(),nums.end());
        for(; i<nums.size()-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=nums.size()-1;
            int sum=(-1)*nums[i];
            while(left<right){
                int s=nums[left]+nums[right];
                if(s==sum){
                    res.push_back({nums[i],nums[left],nums[right]});
                    left++;
                    right--;

                    while(left<nums.size() && nums[left]==nums[left-1]){
                    left++;
                    }

                    while(right>0 && nums[right]==nums[right+1]){
                    right--;
                    }


                }
                
                
                else if (s>sum){
                    right--;
                }
                else{
                    left++;
                }
            }
        }

        return res;
    }
};