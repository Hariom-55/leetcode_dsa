class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        if(nums == null)
        {
            return null;
        }

        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);

        Stack<Integer> greaterNum = new Stack<>();

        for(int i = 2* n-1 ; i>= 0; i--)
        {
            int currentIdx = i % n ;

            while(!greaterNum.isEmpty() && nums[greaterNum.peek()] <= nums[currentIdx])
            {
                greaterNum.pop();
            }

            if(!greaterNum.isEmpty())
            {
                result[currentIdx] = nums[greaterNum.peek()];
            }

            greaterNum.push(currentIdx);
        }

        return result;


    }
}