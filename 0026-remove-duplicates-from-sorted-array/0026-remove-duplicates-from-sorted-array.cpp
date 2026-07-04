class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if(nums.size()==0){
            return 0;
        }

        int low=0;
        int high=1;
        int total_unique=1;
        while(high<nums.size()){      //  for(;high<nums.size();) both are equivalent
            if(nums[high]==nums[high-1]){
                high++;
                continue;
            }

            else{
                low=low+1;
                nums[low]=nums[high];
                high++;
                total_unique++;
            }
        }

        return total_unique;
    }
};