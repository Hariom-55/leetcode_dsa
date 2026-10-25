class Solution {
    public String predictPartyVictory(String senate) {
        
        int n = senate.length();

        Queue<Integer> radiant = new ArrayDeque<>();
        Queue<Integer> dire = new ArrayDeque<>();

        for(int i=0; i<n ; i++)
        {
            if(senate.charAt(i) == 'R')
            {
                radiant.offer(i);
            }
            else
            {
                dire.offer(i);
            }
        }

        while(!radiant.isEmpty() && !dire.isEmpty())
        {
            int ri = radiant.poll();
            int di = dire.poll();

            if(ri < di)
            {
                radiant.offer(ri+n);
            }else{
                dire.offer(di+n);
            }
        }

        return radiant.isEmpty() ? "Dire" : "Radiant";    
    }
}