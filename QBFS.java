import java.util.*;

public class QBFS {
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
    public static void main(String[] args) {
        int v=4;
        
        ArrayList<Edge>[] graph=new ArrayList[v];
    creategraph(graph);
     boolean visited[]=new boolean[v]; 
     for(int i=0;i<v;i++){
        if(visited[i]==false){
             bfs(graph,v,visited,i);
        }
        } 

   
    System.out.println();
        

    }
}
