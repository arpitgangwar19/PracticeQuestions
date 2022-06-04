public class GoldMineProblem {

    public static void main(String[] args)
    {
        int[][] gold = { { 1, 3, 1, 5 },
                { 2, 2, 4, 1 },
                { 5, 0, 2, 3 },
                { 0, 6, 1, 2 } };
        int row = 4, col = 4;
        System.out.println(getMaxGold(gold, row, col));
    }

    private static int getMaxGold(int[][] gold, int row, int col) {

        int result = Integer.MIN_VALUE;
        int[][] dp = new int[row][col];
        for(int i=0;i<col;i++)
        {
            int maxCol = calculateGoldy(gold,i,0,row,col);
            System.out.println(maxCol);
            result = Math.max(result,maxCol);
        }
        return result;
    }

    private static int calculateGoldy(int[][] gold, int irow, int jcol, int row, int col) {

        if(irow<0 || jcol<0  || jcol==col || irow==row )
        {
            return 0;
        }

        int right = calculateGoldy(gold,irow,jcol+1,row,col);
        int digonalupright  = calculateGoldy(gold,irow-1,jcol+1,row,col);
        int digonaldownright = calculateGoldy(gold,irow+1,jcol+1,row,col);

        return gold[irow][jcol]+ Math.max(right,Math.max(digonalupright,digonaldownright));
    }
}
