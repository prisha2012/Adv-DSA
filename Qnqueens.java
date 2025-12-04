public class Qnqueens {
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nqueen(board,0);

    }

    private static void nqueen(char[][] board, int row) {
        int n=board.length;
        if(row==n){
            for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board[i][j]+" ");

            }
            System.out.println();
            }
            System.out.println();
            return;
        }
        
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){    
            board[row][j]='Q';
            nqueen(board,row+1);
            board[row][j]='.';
            }
       }
    }
    private static boolean isSafe(char[][] board,int row,int col){
        int n=board.length;
        for(int j=0;j<n;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        int r=row;
        int c=col;
        while(r>=0 && c<n){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
            c++;
        }
        r=row;
        c=col;
        while(r<n && c<n){
            if(board[r][c]=='Q'){
                return false;
            }
            r++;
            c++;
        }
        r=row;
        c=col;
        while(r<n && c>=0){
            if(board[r][c]=='Q'){
                return false;
            }
            r++;
            c--;
        }
         r=row;
        c=col;
        while(r>=0 && c>=0){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
            c--;
        }
        return true;
        
    }
}
