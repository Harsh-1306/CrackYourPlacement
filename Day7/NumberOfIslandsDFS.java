class Solution {
    private void dfs(int row,int col,char[][]grid,int m,int n)
    {
        if(row<0 || row>=n || col<0 || col>=m)
        {
            return;
        }
        if(grid[row][col]=='0')
        {
            return;
        }
        if(grid[row][col]=='x')
        {
            return;
        }
        grid[row][col]='x';
        dfs(row-1,col,grid,m,n);
        dfs(row+1,col,grid,m,n);
        dfs(row,col-1,grid,m,n);
        dfs(row,col+1,grid,m,n);
    }
    public int numIslands(char[][] grid) {
     int count=0;
     int n=grid.length,m=grid[0].length;
     for(int i=0;i<n;i++)
     {
        for(int j=0;j<m;j++)
        {
            if(grid[i][j]=='1')
            {
                dfs(i,j,grid,m,n);
                count++;
            }
        }
     }
     return count;
    }
}