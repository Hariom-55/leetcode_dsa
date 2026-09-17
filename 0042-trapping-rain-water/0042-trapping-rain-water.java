class Solution {
    public int trap(int[] height) {
        
        int left=0;
        int right = height.length-1;

        int totalWater = 0;

        int leftMax = height[left];
        int rightMax = height[right];

        while(left < right)
        {
            if(height[left] > height[right])
            {
                rightMax = Math.max(rightMax, height[right]);

                if(rightMax - height[right] > 0)
                {
                    totalWater = totalWater + (rightMax-height[right]) ;
                }
                right--;
            }

            else {
                leftMax = Math.max(leftMax, height[left]);

                if(leftMax - height[left] > 0)
                {
                    totalWater = totalWater + (leftMax-height[left]);
                }

                left++;
            }
        }

        return totalWater;
    }
}