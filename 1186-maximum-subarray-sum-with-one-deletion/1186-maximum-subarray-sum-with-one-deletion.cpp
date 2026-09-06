class Solution {
public:
    int maximumSum(vector<int>& arr) {
        
        int noDeletion = arr[0];

        int oneDeletion = 0;

        int ans = arr[0];

        for (int i = 1 ; i< arr.size(); i++){

            int prevNoDelete = noDeletion;
            int prevOneDelete = oneDeletion ;

            //case 1 : No deletion needed then 

            noDeletion = max(arr[i], prevNoDelete+arr[i]);

            //case 2 : one deletion 

            oneDeletion = max(prevOneDelete + arr[i], prevNoDelete);

            ans = max(ans, max(noDeletion , oneDeletion));

        
        }

        return ans ;
    }
};