class Solution {
    public int[] topKFrequent(int[] nums, int k) {


        //HashMap for Count of each element
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int n : nums)
        {
            count.put(n , count.getOrDefault(n,0) +1);
        }

        //Priority Queue
        Queue<Integer> heap = new PriorityQueue<>(
            (a,b) -> Integer.compare(count.get(a), count.get(b))
        );

        for(int n : count.keySet())
        {
            heap.add(n);

            if(heap.size() > k)
            {
                heap.poll();
            }
        }

        int[] ans = new int[k];

        for(int i =0; i<k; i++)
        {
            ans[i] = heap.poll();
        }

        return ans;
    }
}