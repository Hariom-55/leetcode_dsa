class Solution {
    public boolean validMountainArray(int[] arr) {
        
        int n = arr.length;

        if(n < 3)
        {
            return false ;
        }

        int left = 0;
        int right = n-1;

        while( left < n-1 && arr[left] < arr[left+1])
        {
            left++;
        }

        while(right > 0 && arr[right] < arr[right-1])
        {
            right--;
        }

        if( left == right && left != 0 && right != n-1)
        {
            return true;
        }

        return false ;
    }
}