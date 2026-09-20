class Solution {
    private static int checkPalindrome(String s , int left, int right)
    {
        while(left >=0 && right<s.length() && s.charAt(left)== s.charAt(right))
        {
            left--;
            right++;

        }

        return right-left-1;
    }
    public String longestPalindrome(String s) {
        int left =0; 
        int right =0;

        for(int i =0; i<s.length()-1; i++)
        {
            int oddLen = checkPalindrome(s, i, i);
            int evenLen = checkPalindrome(s, i, i+1);

            int maxLen = Math.max(oddLen, evenLen);

            if(maxLen > (right-left))
            {
                left = i -(maxLen-1) / 2;
                right = i+ maxLen / 2;
            }

        }

        return s.substring(left, right+1);
    }
}