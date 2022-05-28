public class PrintSpiralMatrix {

    public static void main(String[] args)
    {
        int R = 4;
        int C = 4;
        int a[][] =  {  {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};

        // Function Call
        spiralPrint(R, C, a);
    }

    private static void spiralPrint(int r, int c, int[][] a) {

        int rowStart =0 ;
        int rowEnd = r;
        int columnStart= 0;
        int columnEnd= c;
        while(rowStart<rowEnd && columnStart<columnEnd)
        {
            for(int i =columnStart;i<columnEnd;i++)
            {
                System.out.print(a[rowStart][i]+" ");
            }
            rowStart++;
            for(int i=rowStart;i<rowEnd;i++)
            {
                System.out.print(a[i][columnEnd-1]+" ");
            }
            columnEnd--;

            if(rowStart<rowEnd)
            {
                for(int i = columnEnd-1;i>=columnStart;i--)
                {
                    System.out.print(a[rowEnd-1][i]+" ");
                }
                rowEnd--;
            }
            if(columnStart<columnEnd)
            {
                for(int i = rowEnd-1;i>=rowStart;i--)
                {
                    System.out.print(a[i][columnStart]+" ");
                }
                columnStart++;
            }




        }
    }

}
