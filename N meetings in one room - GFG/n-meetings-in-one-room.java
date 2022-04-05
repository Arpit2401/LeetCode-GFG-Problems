// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static class Meeting{
        int start;
        int end;
        Meeting(int start,int end)
        {
            this.start = start;
            this.end = end;
        }
    }
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        Meeting arr[] = new Meeting[n];
        for(int i=0;i<n;i++)
            arr[i] = new Meeting(start[i], end[i]);
        Arrays.sort(arr, (a, b) -> a.end-b.end);
        int i = 0;
        int c = 1;
        for(int j=1;j<n;j++)
        {
            
            if(arr[j].start>arr[i].end)
            {
                c++;
                i=j;
            }
        }
        return c;
    }
}
