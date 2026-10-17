class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        int [] speeds = new int[target];

        for(int i=0; i<position.length; i++)
        {
            speeds[position[i]] = speed[i];
        }

        int count = 0;
        double prevTime = 0;

        for(int i = target-1; i>=0 ; i--)
        {
            if(speeds[i] == 0)
            {
                continue;
            }

            double time = (double) (target-i) / speeds[i];

            if(time > prevTime)
            {
                count++;
                prevTime = time;
            }
        }

        return count;
    }
}