class Solution {
    private boolean isOperator(String token)
    {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private int applyOperator(String operator, int a , int b)
    {
        switch(operator)
        {
            case "+": return a+b;
            case "-": return a-b;
            case "*": return a*b;
            case "/": return a/b;
            default : throw new IllegalArgumentException("Invalid Operator");
        }
    }
    

    public int evalRPN(String[] tokens) {

        Deque<Integer> operands = new ArrayDeque<>();
        for(String token: tokens)
        {
            if(!isOperator(token))
            {
                operands.push(Integer.parseInt(token));
            }
            else
            {
                int second = operands.pop();
                int first = operands.pop();

                int result = applyOperator(token, first, second);
                operands.push(result);
            }
        } 

        return operands.pop();   
    }
}