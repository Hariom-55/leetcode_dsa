class Solution {
    public String maxSumOfSquares(int num, int sum) {
        
        if((long) num * 9 < sum)
        {
            return "";
        }

        int  totalNines = sum / 9;
        int remainder = sum % 9;

        StringBuilder ans = new StringBuilder();

        ans.append("9".repeat(totalNines));

        if(remainder > 0)
        {
            ans.append(remainder);
        }

        ans.append("0".repeat(num - ans.length()));

        return ans.toString();



    }
}