class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        
        int n = arr.length;
        int[] best = new int[n];

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1) ;

        int currentSum =0;
        int ans = Integer.MAX_VALUE;
        int currentMinLen = Integer.MAX_VALUE;

        for(int i=0; i<n; i++)
        {
            currentSum += arr[i];
            int complement = currentSum - target ;

            if(map.containsKey(complement))
            {
                int j = map.get(complement);
                int currentLen = i-j;

                //Non-overlapping 
                if(j >=0 && best[j] != Integer.MAX_VALUE)
                {
                    ans = Math.min(ans, currentLen + best[j]);
                }

                currentMinLen = Math.min(currentMinLen, currentLen);
            }

            best[i] = currentMinLen;

            //storing prefix;
            map.put(currentSum , i);   
        }

        if(ans == Integer.MAX_VALUE)
        {
            return -1;
        }

        return ans;
    }
}