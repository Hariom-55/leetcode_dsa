class Solution {
    public String minRemoveToMakeValid(String s) {
        
        HashSet<Integer> removeIndices = new HashSet<>();
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == '(')
            {
                stack.push(i);
            }
            else if(c == ')')
            {
                if(stack.isEmpty())
                {
                    removeIndices.add(i);

                }else{
                    stack.pop();
                }
            }
        }

        while(!stack.isEmpty())
        {
            removeIndices.add(stack.pop());
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++)
        {
            if(!removeIndices.contains(i))
            {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}