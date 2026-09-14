class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        //Creating Hashmap to store count
        HashMap<Integer, Integer> count = new HashMap<>() ;

        for(int n: nums)
        {
            count.put(n, count.getOrDefault(n,0) + 1);
        }

        //sorting based on frequencies
        Integer[] elements = count.keySet().toArray(new Integer[0]);

        Arrays.sort(elements , 
        (a,b) -> Integer.compare(count.get(b), count.get(a)));


        int[] ans = new int[k];

        for (int i=0; i<k; i++)
        {
            ans[i] = elements[i];
        }

        return ans;
    }
}