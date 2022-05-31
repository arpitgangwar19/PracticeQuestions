public class Maximum1sInMatrix {


    public static void main(String[] args)
    {
        int mat[][] = { { 0, 0, 0, 1 },
                { 0, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 0, 0, 0, 0 } };
        System.out.println("Index of row with maximum 1s is "
                + rowWithMax1s(mat));
    }

    private static int rowWithMax1s(int[][] mat) {
         int result = Integer.MIN_VALUE;
         int marow= 0;
        for(int i =0;i<mat.length;i++)
        {
            int indexOfOne = findIndex(mat[i],0,mat[0].length-1);
            result = Math.max(result,indexOfOne);

            if (indexOfOne != -1 && mat[0].length - indexOfOne > result) {
                result = mat[0].length - indexOfOne;
                marow = i;
            }
        }
        return marow;
    }

    private static int findIndex(int[] mat, int low, int high) {

        if(high>=low)
        {
            int mid = low + (high-low)/2;
            if ((mid == 0 || (mat[mid - 1] == 0)) && mat[mid] == 1)
            {
                return mid;

            }
            else if(mat[mid]==0){
                return findIndex(mat,mid+1,high);
            }
            else {
                return  findIndex(mat,low,mid-1);
            }
        }


        return 1;
    }
}
