class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int low=0;
        int n =s.length();
        int res=0;
        unordered_map<char,int> hash;
        for(int high=0; high<n;high++){
            hash[s[high]]++;
            int k =high-low+1;

            while(hash.size()<k){
                hash[s[low]]--;
                if(hash[s[low]]==0){
                    hash.erase(s[low]);

                }
                low++;
                k=high-low+1;
            }

            int len =high-low+1;
            res=max(res,len);
        }
        return res;
    }
};