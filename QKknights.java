public class QKknights{
    static int max=-1;
    
    public static boolean isSafe(char grid[][],int row,int col){
    int n=grid.length;
        
        int i,j;
        i=row-2;
        j=col+1;
        if(i>=0&&j<n &&grid[i][j]=='K')return false;
        i=row-2;
        j=col-1;
        if(i>=0&&j>=0 &&grid[i][j]=='K')return false;
        i=row+2;
        j=col+1;
        if(i<n&&j<n &&grid[i][j]=='K')return false;
        i=row+2;
        j=col-1;
        if(i<n&&j>=0 &&grid[i][j]=='K')return false;
        i=row-1;
        j=col+2;
        if(i>=0&&j<n &&grid[i][j]=='K')return false;
        i=row-1;
        j=col-2;
        if(i>=0&&j>=0 &&grid[i][j]=='K')return false;
         i=row+1;
        j=col+2;
        if(i<n&&j<n &&grid[i][j]=='K')return false;
        i=row+1;
        j=col-2;
        if(i<n&&j>=0 &&grid[i][j]=='K')return false;
       
        return true;
    }
    public static void helper(char grid[][],int row,int col,int num){
        int n=grid.length;
        if(row==n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(grid[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        else if(isSafe(grid,row,col)){
            grid[row][col]='K';
            if(col!=n-1) helper(grid,row,col+1,num+1);
            else helper(grid, row+1, 0, num+1);
            grid[row][col]='.';
           
        }
        
            if(col!=n-1) helper(grid,row,col+1,num+1);
            else helper(grid, row+1, 0, num+1);
    
    }
        
        
    public static void main(String[] args) {
        int n=3;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        helper(board,0,0,0);
    }
}
