// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		int[] res = new Sol().count (s);
    		
    		for (int i = 0; i < 4; i++)
    		    System.out.println (res[i]);
        }
        
    }
}
// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Sol
{
    int[] count (String s)
    {
        // your code here
        int ans[] = new int[4];
        for(char ch : s.toCharArray())
        {
            if(Character.isUpperCase(ch))
                ans[0]++;
            else if(Character.isLowerCase(ch))
                ans[1]++;
            else if(Character.isDigit(ch))
                ans[2]++;
            else
                ans[3]++;
        }
        return ans;
    }
}