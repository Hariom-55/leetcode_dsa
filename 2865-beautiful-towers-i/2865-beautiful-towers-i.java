class Solution {
    public long maximumSumOfHeights(int[] heights) {
        
        int peakIdx = 0 ;
        long maxOverallSum = 0;

        for(; peakIdx<heights.length; peakIdx++)
        {
            int left = peakIdx - 1;
            int right = peakIdx + 1;
            long sum = heights[peakIdx];


            int leftMin = heights[peakIdx];

            while(left >= 0)
            {
                leftMin = Math.min(leftMin, heights[left]);
                sum += leftMin;
                left--;
            }

            int rightMin = heights[peakIdx];
            while(right < heights.length)
            {
                rightMin = Math.min(rightMin, heights[right]);
                sum += rightMin;
                right++;
            }

            maxOverallSum = Math.max(maxOverallSum , sum);
        }

        

        return maxOverallSum;

    }
}