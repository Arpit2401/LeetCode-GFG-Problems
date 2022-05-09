class Solution {
    private String[] carr;
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
           return new ArrayList<>();
        List<String> list=new ArrayList<>();
        carr=new String[10];
        carr[2]="abc";
        carr[3]="def";
        carr[4]="ghi";
        carr[5]="jkl";
        carr[6]="mno";
        carr[7]="pqrs";
        carr[8]="tuv";
        carr[9]="wxyz";
        helper(digits,0,list,new StringBuilder());
        return list;
    }
    private void helper(String digits,int i,List<String> list,StringBuilder res){
        if(i==digits.length())
        {
            list.add(res.toString());
            return;
        }
        String keys=carr[digits.charAt(i)-'0'];
        char c;
        for(int j=0;j<keys.length();j++)
        {
            c=keys.charAt(j);
            res.append(c);
            helper(digits,i+1,list,res);
            res.deleteCharAt(res.length()-1);
        }
    }
}