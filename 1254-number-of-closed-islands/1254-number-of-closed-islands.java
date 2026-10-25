class Solution {

    private static boolean isEnclosed(int[][] grid, int r, int c)
    {

        if(r<0 || r>= grid.length || c<0 || c>= grid[0].length)
        {
            return false;
        }

        if(grid[r][c] == 1)
        {
            return true;
        }

        grid[r][c] = 1;

        boolean up = isEnclosed(grid, r-1, c);
        boolean down = isEnclosed(grid, r+1, c);
        boolean left = isEnclosed(grid, r, c-1);
        boolean right = isEnclosed(grid, r, c+1);

        return up & down & left & right;

    }
    public int closedIsland(int[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;

        int count = 0;

        for(int i=0; i<row; i++)
        {
            for(int j=0 ; j<col; j++)
            {
                if(grid[i][j] == 0 & isEnclosed(grid, i, j))
                {
                    count++;
                }
            }

        }

        return count;
    }
}