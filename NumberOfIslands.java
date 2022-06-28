//Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
//
//        An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
//
//example :
//        Input: grid = [
//        ["1","1","1","1","0"],
//        ["1","1","0","1","0"],
//        ["1","1","0","0","0"],
//        ["0","0","0","0","0"]
//        ]
//        Output: 1
public class NumberOfIslands {

    public static void main(String[] ssss) {
        int grid[][] = new int[][]{
                {1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}};

        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    result = result + 1;
                    checkAdjacent(grid, i, j);
                }
            }
        }
        System.out.println(result);

    }

    private static void checkAdjacent(int[][] grid, int i, int j) {

        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 || grid[i][j] == 2)
            return;
        if (grid[i][j] == 1)
            grid[i][j] = 2;
        checkAdjacent(grid, i - 1, j);
        checkAdjacent(grid, i + 1, j);
        checkAdjacent(grid, i, j - 1);
        checkAdjacent(grid, i, j + 1);
    }
}
