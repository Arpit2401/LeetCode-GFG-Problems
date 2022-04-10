class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for(String i : ops)
        {
            if("+".equals(i))
            {
                int op1 = stack.pop();
                int op2 = op1 + stack.peek();
                stack.push(op1);
                stack.push(op2);
            }
            else if("C".equals(i))
                stack.pop();
            else if("D".equals(i))
                stack.push(2*stack.peek());
            else
                stack.push(Integer.parseInt(i));
        }
        int ans=0;
        while(!stack.isEmpty())
            ans+=stack.pop();
        return ans;
    }
}