class Solution {
    private void validString(List<String> result, StringBuilder curr, int open, int close, int max)
    {
        if(curr.length() == max*2)
        {
            result.add(curr.toString());
            return;
        }

        if(open < max)
        {
            curr.append('(');
            validString(result, curr, open+1, close, max);
            curr.deleteCharAt(curr.length() - 1);
        }

        if (close < open)
        {
            curr.append(')');
            validString(result, curr, open, close+1, max);
            curr.deleteCharAt(curr.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        
        List<String> result = new ArrayList<>();
        validString(result, new StringBuilder(), 0, 0, n);

        return result;
    }
}