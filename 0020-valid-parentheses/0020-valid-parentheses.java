class Solution {
    public boolean isValid(String s) {

        if(s == null)
        {
            return false;
        }

        Stack<Character> valid = new Stack<>();

        for(int i=0 ; i<s.length(); i++)
        {
            char c = s.charAt(i);

            if(c == '(' || c == '{' || c =='[')
            {
                valid.push(c);
            }
            else{

                if(valid.isEmpty())
                {
                    return false ;
                }

                char top = valid.peek();

                if(
                    c == ')' && top == '(' ||
                    c == '}' && top == '{' ||
                    c == ']' && top == '['
                ){
                    valid.pop();
                }else{
                    return false;
                }
                
            }

        }

        return valid.isEmpty();


    }
}