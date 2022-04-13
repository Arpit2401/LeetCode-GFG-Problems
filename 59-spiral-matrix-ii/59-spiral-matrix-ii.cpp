class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        
        vector<vector<int>> ans(n, vector<int>(n,0));
        
        int left=0, right=n-1, top=0, bottom=n-1;
        int k=1;
        
        while(top<=bottom && left<=right)
        {
            for(int i=left; i<=right; i++)
                ans[top][i]=k++;
            top++;
            
            for(int i=top; i<=bottom; i++)
                ans[i][right]=k++;
            right--;
            
            if(top<=bottom && left<=right)
            {
                for(int i=right ; i>=left; i--)
                    ans[bottom][i]=k++;
                bottom--;
                
                for(int i=bottom; i>=top; i--)
                    ans[i][left]=k++;
                left++;
            }
        }
        
        return ans;
    }
};