public class mazepath{
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        // int count=maze(1,1,rows,cols);
        // System.out.println(count);
        boolean[][] visited=new boolean[rows][cols];
        print(0,0,rows-1,cols-1,"",visited);
    }
    // public static int maze(int i,int j,int rows,int cols){
    //     if(i>rows || j>cols){
    //         return 0;
    //     }
    //     if(i==rows&&j==cols){
    //         return 1;
    //     }
    //     int downsways=maze(i+1,j,rows,cols);
    //     int rightways=maze(i,j+1,rows,cols);
    //     int totalways=downsways+rightways;
    //     return totalways;
    // }
    static void print(int i,int j,int rows,int cols,String path,boolean[][] visited){
          if(i>rows||j>cols){
            return;
        }
         if(i<0||j<0){
            return;
        }
        if(visited[i][j]==true){
            return;
        }
      
        if(i==rows&&j==cols){
            System.out.println(path);
            return;
        }
        visited[i][j]=true;
        print(i+1,j,rows,cols,path+"D",visited);
        print(i,j+1,rows,cols,path+"R",visited);
        print(i-1,j,rows,cols,path+"U",visited);
        print(i,j-1,rows,cols,path+"L",visited);
        visited[i][j]=false;

    }
}