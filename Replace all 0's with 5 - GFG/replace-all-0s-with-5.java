// { Driver Code Starts
import java.util.*;
class Replace{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt();
		Solution g=new Solution();
		System.out.println(g.convertFive(n));
	}
}
}// } Driver Code Ends


/*Complete the function below*/
class Solution{
	public static int convertFive(int n){
    //add code here.
        String st = Integer.toString(n);
        String ans = "";
        for(char ch : st.toCharArray())
        {
            if(ch=='0')
                ans+='5';
            else
                ans+=ch;
        }
        return Integer.parseInt(ans);
    }
}