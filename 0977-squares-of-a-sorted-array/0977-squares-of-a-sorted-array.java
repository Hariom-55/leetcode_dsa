class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;

        int[] arr = new int[nums.length];
        int idx =nums.length-1;

        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                arr[idx--]=nums[left]*nums[left];
                left++;
            }
            else{
                arr[idx--]=nums[right]*nums[right];
                right--;
            }
        }

        return arr;

    }
}