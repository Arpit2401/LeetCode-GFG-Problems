class Solution {
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        
        Integer [][][] dp = new Integer[101][101][101];
        int x=0;
        x=helper(0, houses, target , m , n , 0, cost , 0, dp);
        if(x!=Integer.MAX_VALUE){
            return x;
        }else{
            return -1;
        }
    }
    
    static int helper(int nn ,int []houses , int target , int m , int n , int index, int[][] cost , int last , Integer [][][] dp){
        
        if(dp[index][nn][last]!=null){
            return dp[index][nn][last];
        }
        
       if(index==houses.length || nn>target)
        {
            if(nn==target)
                return 0;
           
            return Integer.MAX_VALUE;
        }
        
       int min = Integer.MAX_VALUE;
 
      if(houses[index] == 0){
           for(int i=0;i<n;i++){
               int mincost = Integer.MAX_VALUE;
                
              if(last ==i+1){
                mincost = helper(nn , houses, target , m , n, index+1 , cost , i+1 ,dp);
              }else{
                   mincost =helper(nn+1 , houses ,target, m, n, index+1, cost, i+1 ,dp);
              }
               if(mincost!=Integer.MAX_VALUE)
                    mincost+=cost[index][i];
               
                min= Math.min(min, mincost);
           }
         
         
      }else{
          if(last == houses[index]){
             min=  helper(nn, houses, target, m, n, index+1, cost , last, dp);
          }else{
               min =   helper(nn+1, houses, target, m, n, index+1, cost , houses[index],dp);
          }
         
      }
            
        
        
       return dp[index][nn][last]= min;
    }
}