class Solution {
    public long maximumSumOfHeights(int[] heights) {
        
        int n = heights.length;
        
        long [] leftSum = new long[n];
        long [] rightSum = new long[n];

        Stack<Integer> stack = new Stack<>();

        for(int i =0; i<n ; i++)
        {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i])
            {
                stack.pop();
            }

            if(stack.isEmpty())
            {
                leftSum[i] = (long)(i+1) * heights[i];
            }
            else{
                int prev = stack.peek();
                leftSum[i] = leftSum[prev] + (long)(i - prev) * heights[i];
            }

            stack.push(i);
        }

        stack.clear();


        for(int i = n-1; i>=0; i--)
        {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i])
            {
                stack.pop();
            }

            if(stack.isEmpty())
            {
                rightSum[i] = (long)(n-i) * heights[i];
            }
            else{
                int next = stack.peek();
                rightSum[i] = rightSum[next] + (long)(next-i) * heights[i];
            }

            stack.push(i);
        }

        long overallMaxSum = 0;
        for(int i = 0; i<n ; i++)
        {
            long currentSum = leftSum[i] + rightSum[i] - heights[i];

            overallMaxSum = Math.max(currentSum, overallMaxSum);
        }

        return overallMaxSum;


    }
}