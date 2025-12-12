import java.util.*;
public class Cycledetection {



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
    public static void main(String[] args) {
        int v=4;
        
        ArrayList<Edge>[] graph=new ArrayList[v];
    creategraph(graph);
    //  boolean visited[]=new boolean[v]; 
    //  for(int i=0;i<v;i++){
    //     if(visited[i]==false){
    //          bfs(graph,v,visited,i);
    //     }
    //     } 
    boolean visited[]=new boolean[v];
    boolean recStack[]=new boolean[v];
    for(int i=0;i<v;i++){
        if(!visited[i]){
            System.out.println(isCycleDirected(graph, i, visited, recStack));
        }
    }
    //System.out.println(isCycleDirected(graph, 0, new boolean[v], new boolean[v]));

   
        

    }


}


    

