import java.util.*;
public class DDgrid{
    public static boolean search(char [][] grid,int i,int j,String word,int index){
        int rows=grid.length;
        int cols=grid[0].length;
        if(index==word.length()){
            return true;
        }
        if(i<0||j<0||i>=rows||j>=cols||grid[i][j]!=word.charAt(index)){
            return false;
        }
        char temp=grid[i][j];
        grid[i][j]='#';
        boolean found=search(grid,i+1,j,word,index+1)||
                    search(grid,i-1,j,word,index+1)||
                    search(grid,j+1,j,word,index+1)||
                    search(grid,j-1,j,word,index+1);
                    grid[i][j]=temp;
                    return found;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.nextLine(); 
        char[][] grid=new char[rows][cols];

        for(int i=0;i<rows;i++){
            String line=sc.nextLine();
            grid[i]=line.toCharArray();
        }
        String words=sc.nextLine();

          for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (search(grid, i, j, words, 0)) {
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No");
    }

    
}