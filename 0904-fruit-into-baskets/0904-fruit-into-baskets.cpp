class Solution {
public:
    int totalFruit(vector<int>& fruits) {
        int n=fruits.size();
        int low=0;
        int high=0;
        unordered_map<int,int> basket;
        int res=1;
        for(;high<n;high++){
            basket[fruits[high]]++;

            while(basket.size()>2){
                basket[fruits[low]]--;
                if(basket[fruits[low]]==0){
                    basket.erase(fruits[low]);
                }
                low++;
            }
            int len = high-low+1;
            res=max(res,len);
        }

        return res;
    }
};