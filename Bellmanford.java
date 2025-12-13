
import java.util.*;
public class Bellmanford {

    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int wt){
            this.src=s;
            this.dest=d;
            this.wt=wt;
        }

        
    }
    public static void creategraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2,2));
        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));
        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));
        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));
    }
    public static void bfs(ArrayList<Edge>[] graph,int V,boolean visited[],int start){
        Queue<Integer> q=new LinkedList<>();
        // boolean visited[]=new boolean[V];
        q.add(start);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!visited[curr]){
                System.out.print(curr+" ");
                visited[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
            }
        }
    }
    }
    public static void dfs(ArrayList<Edge>[] graph,boolean visited[],int curr){
        System.out.print(curr+" ");
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!visited[e.dest])
            dfs(graph, visited, e.dest);
                
        }

    }
    public static void allPaths(ArrayList<Edge>[] graph, boolean visited[], int curr, String path, int target) {
    if(curr == target){
        System.out.println(path);
        return;
    }
    for (int i = 0; i < graph[curr].size(); i++) {
        Edge e = graph[curr].get(i);
        if(!visited[e.dest]) {
            visited[curr] = true;
            allPaths(graph, visited, e.dest, path+e.dest,target);
            visited[curr] = false;
        }
    }
    }
    public static boolean isCycleDirected(ArrayList<Edge>[] graph, int curr, boolean visited[], boolean recStack[]) {
         visited[curr] = true;
           recStack[curr] = true;
           for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(recStack[e.dest]){
                return true;
            }
            else if(!visited[e.dest]){
                if(isCycleDirected(graph, e.dest, visited, recStack)){
                    return true;
                }
                  
            }
           }
            recStack[curr] = false;
            return false;
            }
    public static void topologicalSortUtil(ArrayList<Edge>[] graph, int curr, boolean visited[], Stack<Integer> stack) {
        visited[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!visited[e.dest]){
                topologicalSortUtil(graph, e.dest, visited, stack);
            }
        }
        stack.push(curr);
    }
    public static void topsort(ArrayList<Edge>[] graph, int V){
        boolean visited[]=new boolean[V];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<V;i++){
            if(!visited[i]){
                topologicalSortUtil(graph, i, visited, stack);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
    static boolean isCycleUndirected(ArrayList<Edge>[] graph,int curr, boolean visited[],int parent){
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(visited[e.dest] && e.dest != parent){
                return true;
            }
            else if(!visited[e.dest]){
                if(isCycleUndirected(graph, e.dest, visited, curr)){
                    return true;
                }

            }

        }
        return false;

    }
    public static class pair implements Comparable<pair>{
        int node;
        int dist;
        public pair(int n,int d){
            this.node=n;
            this.dist=d;
        }
        @Override
        public int compareTo(pair p2){
            return this.dist - p2.dist;
        }
    }
    public static void dijkstra(ArrayList<Edge>[] graph,int src,int V){
        PriorityQueue<pair> pq=new PriorityQueue<>();
        int dist[]=new int[V];
        boolean visited[]=new boolean[V];
        for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        pq.add(new pair(src,0));

        while(!pq.isEmpty()){
            pair curr=pq.remove();
            if(!visited[curr.node]){
                visited[curr.node]=true;
                for(int i=0;i<graph[curr.node].size();i++){
                    Edge e=graph[curr.node].get(i);
                    int u=e.src;
                    int v=e.dest;
                    if(!visited[v] && dist[u]+e.wt < dist[v]){
                        dist[v]=dist[u]+e.wt;
                        pq.add(new pair(v,dist[v]));
                    }
            }
        }
    }
    for(int i=0;i<dist.length;i++){
        System.out.print(dist[i]+" ");
    }

    }
    public static void bellmanFord(ArrayList<Edge>[] graph, int src, int V) {
        int dist[] = new int[V];
        for (int i = 0; i < V; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        for(int k=0;k<V-1;k++){
            for(int i=0;i<graph.length;i++){
                for(int j=0;j<graph[i].size();j++){
                    Edge e=graph[i].get(j);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;
                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt < dist[v]){
                        dist[v]=dist[u]+wt;
                    }
                }
            
        }
    }
    for(int i=0;i<dist.length;i++){
        System.out.print(dist[i]+" ");
    }
}
    public static void main(String[] args) {
        int v=4;
        
        ArrayList<Edge>[] graph=new ArrayList[v];
    creategraph(graph);
    //  boolean visited[]=new boolean[v]; 
    //  for(int i =0;i<v;i++){
    //     if(visited[i]==false){
    //          bfs(graph,v,visited,i);
    //     }
    // //     } 
    // boolean visited[]=new boolean[v];
    // boolean recStack[]=new boolean[v];
    // for(int i=0;i<v;i++){
    //     if(!visited[i]){
    //         System.out.println(isCycleDirected(graph, i, visited, recStack));
    //topsort(graph, v);
   // System.out.println();
   //dijkstra(graph, 0, v);
    bellmanFord(graph, 0, v);

         }
    }
    //System.out.println(isCycleDirected(graph, 0, new boolean[v], new boolean[v]));


        

    


    



    



