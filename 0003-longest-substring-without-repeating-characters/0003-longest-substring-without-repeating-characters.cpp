class Solution {
public:
    int lengthOfLongestSubstring(string s) {
       int low=0;
       int high=0;
       int res=0;
       int n=s.length();
       unordered_map<char,int> f;
       for(;high<n;high++){
        if(f.count(s[high]) && f[s[high]]>=low){
            low=f[s[high]]+1;
        }
        f[s[high]]=high;
        int len=high-low+1;
        res=max(res,len);

       }

       return res;

    }
};