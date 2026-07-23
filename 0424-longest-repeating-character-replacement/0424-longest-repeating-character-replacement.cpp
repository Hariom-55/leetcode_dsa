class Solution {
public:
    int find(vector<int> &a){
        int mxc=-1;
        for(int i=0;i<256;i++){
            mxc=max(mxc,a[i]);
        }
        return mxc;

    }
    int characterReplacement(string s, int k) {
        int n = s.length();
        int low=0;
        int res=INT_MIN;
        vector<int> freq(256,0);
        for(int high=0;high<n;high++){
            freq[s[high]]++;
            int len =high-low+1;
            int max_Count=find(freq);
            int diff =len-max_Count;
            while(diff > k){
                freq[s[low]]--;
                low++;
                len =high-low+1;
                max_Count=find(freq);
                diff=len-max_Count;
            }

            len=high-low+1;
            res=max(res,len);
        }
        return res;
    }
};