class Solution {
    private void validString(List<String> result, char[] curr, int index, int open, int close, int max)
    {
        if(index == max*2)
        {
            result.add(new String(curr));
            return;
        }

        if(open < max)
        {
            curr[index] = '(';
            validString(result, curr, index+1, open+1, close, max);
        }

        if (close < open)
        {
            curr[index] =')';
            validString(result, curr, index+1, open, close+1, max);
            
        }
    }
    public List<String> generateParenthesis(int n) {
        
        List<String> result = new ArrayList<>();
        validString(result, new char[n*2],0, 0, 0, n);

        return result;
    }
}