class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //pointer at end of each array

        int first = m-1;
        int second = n-1;

        int end = m+n -1;

        while( second >= 0)
        {
            if (first >=0 && nums1[first] > nums2[second])
            {
                nums1[end] = nums1[first];
                first--;
            }else {
                nums1[end] = nums2[second];
                second--;
            }

            end--;
        }
    }
}