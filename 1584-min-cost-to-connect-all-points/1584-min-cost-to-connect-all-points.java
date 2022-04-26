class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        PriorityQueue<int[]> pq=new PriorityQueue<>((arr1,arr2)->{
            return arr1[0]-arr2[0];
        });
        boolean[] visited=new boolean[n];
        int index=0;
        visited[0]=true;
        int res=0;
        for(int count=1;count<n;++count){
            int x=points[index][0];
            int y=points[index][1];
            for(int i=1;i<n;++i){
                if(!visited[i]){
                    int[] p=points[i];
                    pq.add(new int[]{Math.abs(x-p[0])+Math.abs(y-p[1]),i});
                }
            }
            while(visited[pq.peek()[1]])
                pq.poll();
            int[] connect=pq.poll();
            res+=connect[0];
            index=connect[1];
            visited[index]=true;
        }
        return res;
    }
}