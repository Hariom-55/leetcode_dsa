class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> duplicate = new Stack<>();

        for(int i =0; i<s.length(); i++)
        {
            char c = s.charAt(i);

            if(!duplicate.isEmpty() && duplicate.peek() == c)
            {
                duplicate.pop();
            }else{
                duplicate.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!duplicate.isEmpty())
        {
            sb.append(duplicate.pop());
        }

        return sb.reverse().toString();

    }
}