class Solution {
public:
    string minWindow(string s, string t) {
        unordered_map<char,int> need;
        unordered_map<char,int> window;

        int low=0;
        int matched =0;

        for(char c:t){
            need[c]++;
        }
        int required = need.size();

        int minLength=INT_MAX;
        int startIndex=0;

        for(int high =0 ;high<s.length();high++){
            char current = s[high];
            window[current]++;

            if(need.find(current) != need.end() &&window[current]==need[current]  ){
                matched++;
            }

            while(matched==required){
                int currentlen=high-low+1;
                if(currentlen<minLength){
                    minLength=currentlen;
                    startIndex=low;
                }

                char leftchar = s[low];
                window[leftchar]--;

                if(need.find(leftchar)!=need.end() && window[leftchar]<need[leftchar]){
                    matched--;
                }

                low++;
            }

        }
        if(minLength==INT_MAX){
                return "";
            }
            else{
                return s.substr(startIndex,minLength);
            }
        }   


    
};