class Solution {
    public int evalRPN(String[] tokens) {
       
        int[] stack = new int[(tokens.length + 1) / 2];
        int top = -1;
        
        for (String token : tokens) {
            char c = token.charAt(0);
            
            
            if (token.length() == 1 && (c == '+' || c == '-' || c == '*' || c == '/')) {
                int b = stack[top--];
                int a = stack[top--];
                
                switch (c) {
                    case '+': stack[++top] = a + b; break;
                    case '-': stack[++top] = a - b; break;
                    case '*': stack[++top] = a * b; break;
                    case '/': stack[++top] = a / b; break;
                }
            } else {
                stack[++top] = Integer.parseInt(token);
            }
        }
        
        return stack[top];
    }
}