class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        
        vector<int> combined_array;

        int first=0; //traverseling the first array
        int second=0; // traverseling the second array
        int m=nums1.size();
        int n=nums2.size();

        while(first<m && second<n){
            if(nums1[first]<=nums2[second]){
                combined_array.push_back(nums1[first]);
                first++;
            }
            else{
                combined_array.push_back(nums2[second]);
                second++;
            }
        }

        while(first<m){
            combined_array.push_back(nums1[first]);
            first++;
        }

        while(second<n){
            combined_array.push_back(nums2[second]);
            second++;
        }

        int size=combined_array.size();
        if(size%2==0){
            return (combined_array[size / 2 - 1] + combined_array[size / 2]) / 2.0;

        }else{
            return combined_array[size/2];
        }


    
    }
};