public class MatrixcalOne {



   public static  void  main (String[] a)
   {
       int mat[][] = {
       { 1, 1, 0 },
       { 1, 0, 0 },
       {0, 0 , 0 }
   };
       int[][] result = new int[mat.length][mat[0].length];

       for(int i=0;i<mat.length;i++)
       {
           for(int j=0;j<mat[0].length;j++)
           {
               if(mat[i][j]==0)
               {
                   result[i][j]=0;
               }
               else{
                   int minDis = calculat(mat,i,j,mat.length,mat[0].length,0);
                   result[i][j]= minDis;
               }
           }
       }
       for (int i=0;i<mat.length;i++)
       { for(int j=0;j<mat[0].length;j++)
       { System.out.print(mat[i][j]);}
           System.out.println("");}

//       return result;

   }
   public static int calculat(int[][] num,int i,int j,int row, int col,int steps)
    {
        if(i<0 || j<0 || i==row || j==col || num[i][j]==0)
        {
            return 0;
        }


        int right =  calculat(num,i,j+1,row,col,steps);
        int down = calculat(num,i+1,j,row,col,steps);
        return Math.max(right,down)+1;

    }

}
