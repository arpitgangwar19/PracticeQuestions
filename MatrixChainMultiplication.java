public class MatrixChainMultiplication {
    public static void main(String args[]) {
        int arr[] = new int[]{1, 2, 3, 4, 3};
        int n = arr.length;
        int[][] dp = new int[args.length][args.length];
        int[][] sp = new int[args.length][args.length];

        System.out.println(
                "Minimum number of multiplications is "
                        + MatrixChainOrder(arr, 1, n - 1));
        System.out.println(
                "Minimum number of multiplications is "
                        + MatrixChainOrderWithDp(arr, 1, n - 1, dp, sp));
    }

    private static int MatrixChainOrderWithDp(int[] arr, int start, int end, int[][] dp, int[][] sp) {
        return 0;
    }

    private static int MatrixChainOrder(int[] arr, int start, int end) {

        if (start == end)
            return 0;
        int min = Integer.MAX_VALUE;

        for (int k = start; k < end; k++) {
            int count = MatrixChainOrder(arr, start, k) +
                    MatrixChainOrder(arr, k + 1, end) +
                    arr[start - 1] * arr[k] * arr[end];

            min = Math.min(min, count);
        }


        return min;
    }
}
