class Solution {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(1));
        if(numRows==1)
            return ans;
        ans.add(Arrays.asList(1,1));
        if(numRows==2)
            return ans;
        for(int i=2;i<numRows;i++)
        {
            List<Integer> res = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                    res.add(1);
                else
                    res.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
            }
            ans.add(res);
        }
        return ans;
    }
}