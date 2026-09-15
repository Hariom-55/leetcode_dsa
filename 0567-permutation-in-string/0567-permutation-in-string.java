class Solution {

    private static boolean matches(int[] s1, int[] s2)
    {
        for(int i=0; i<26;i++)
        {
            if(s1[i] != s2[i])
            {
                return false;
            }
        }

        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length())
        {
            return false;
        }

        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];

        //Intialize the frequency map for s1 and s2

        for(int i=0; i<s1.length(); i++){
            s1Freq[s1.charAt(i)-'a']++;
            s2Freq[s2.charAt(i)-'a']++;
        }

        for(int i=0; i< s2.length()- s1.length(); i++){

            if(matches(s1Freq, s2Freq)){
                return true;
            }

            s2Freq[s2.charAt(i+s1.length()) - 'a']++;
            s2Freq[s2.charAt(i)-'a']--; //removing old charcter

        }

        return matches(s1Freq, s2Freq);
    }
}