class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {

        //using merge two sorted  array logic 
        vector<int> neg;
        vector<int> pos;

        for(int i=0;i<nums.size();i++){
            if(nums[i]>=0){
                pos.push_back(nums[i]);
            }
            else{
                neg.push_back(nums[i]);
            }
        }
        int n=pos.size();
        int m=neg.size();
        vector<int> res(n+m);

        if(n==0){
            for(int i=0;i<m;i++){
                res[i]=neg[i]*neg[i];    
            }
            reverse(res.begin(),res.end());
            return res;
        }
        else if(m==0){
            for(int i=0;i<n;i++){
                res[i]=pos[i]*pos[i];
            }
            return res;
        }

        else{
            // both arrays have some element, creating of square array for both
            for(int i=0;i<n;i++){
                pos[i]=pos[i]*pos[i];
            }
            for(int j=0;j<m;j++){
                neg[j]=neg[j]*neg[j];
                
            }
            reverse(neg.begin(),neg.end());

            //merging pos and negative squared arrays

            int fp=0;
            int sp=0;
            int id=0; // pointer to traverse the result array

            while(fp<m && sp<n){
                if(neg[fp]<=pos[sp]){
                    res[id]=neg[fp];
                    id++;
                    fp++;
                }
                else{
                    res[id]=pos[sp];
                    id++;
                    sp++;
                }

               
            }
            while(fp<m){
                res[id]=neg[fp];
                id++;
                fp++;
            }
            while(sp<n){
                res[id]=pos[sp];
                id++;
                sp++;
            }

            return res;

            
        }





    }
};