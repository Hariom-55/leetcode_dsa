class Solution {
    private static long islandSum(int[][] grid, int r, int c)
    {
        if(r<0 || r>= grid.length || c<0 || c>= grid[0].length || grid[r][c] <= 0)
        {
            return 0;
        }


        long sum = grid[r][c];
        grid[r][c] = -1;

        sum += islandSum(grid, r-1, c); 
        sum += islandSum(grid, r+1, c);
        sum += islandSum(grid, r, c+1);
        sum += islandSum(grid, r, c-1);

        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        
        int row = grid.length;
        int col = grid[0].length;

        int validCount = 0;

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(grid[i][j] > 0)
                {
                    long totalSum = islandSum(grid, i, j);

                    if(totalSum % k == 0)
                    {
                        validCount++;
                    }
                }
            }
        }

        return validCount;
    }
}