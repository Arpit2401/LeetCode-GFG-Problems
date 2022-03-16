class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int k = 0;
        for(int i : pushed)
        {
            st.push(i);
            while(!st.isEmpty() && st.peek() == popped[k])
            {
                st.pop();
                k++;
            }
        }
        return st.isEmpty();
    }
}