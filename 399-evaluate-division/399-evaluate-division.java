class Edge{
    double value;
    String ch;
    public Edge(double value,String ch){
        this.value=value;
        this.ch=ch;
    }
}
class Solution {
    Map<String,List<Edge>> map;

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        map=new HashMap<>();
        int index=0;
        for(List<String> equation:equations) {
            String u=equation.get(0);
            String v=equation.get(1);
            add(u,v,values[index]);
            add(v,u,1/values[index++]);
        }
        double[] result=new double[queries.size()];
        index=0;
        for(List<String> query:queries){
            Set<String> visited=new HashSet<>();
            result[index++]=dfs(query.get(0),query.get(1),visited);
        }
        return result;
    }
    public void add(String u,String v,double val){
        List<Edge> ls=map.getOrDefault(u,new ArrayList<>());
        ls.add(new Edge(val, v));
        map.put(u,ls);
    }
    public double dfs(String source, String target,Set<String> visited){
        List<Edge> ls=map.get(source);
        if(ls==null) return -1.00;
        if(visited.contains(source)) return -1.00;
        for(Edge ed:ls){
            if(ed.ch.equals(target)) {
             return ed.value;    
            }
            visited.add(source);
             double ans=dfs(ed.ch,target,visited);
            if(ans!=-1.00) return ans*ed.value;
        }
        return -1.00; 
    }
}