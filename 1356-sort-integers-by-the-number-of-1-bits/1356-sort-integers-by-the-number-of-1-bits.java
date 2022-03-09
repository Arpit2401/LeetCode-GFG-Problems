class Solution {
    public int[] sortByBits(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int x = 0;
        while(n>0)
        {
            List<Integer> list = new ArrayList<>();
            for(int i : arr)
            {
                if(Integer.bitCount(i)==x)
                {
                    list.add(i);
                    n--;
                    System.out.println(i);
                }
            }
            x++;
            Collections.sort(list);
            for(int j=0;j<list.size();j++)
                ans.add(list.get(j));
        }
        for(int i=0;i<ans.size();i++)
            arr[i] = ans.get(i);
        return arr;
    }
}