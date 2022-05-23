public class EggDrop {

    public  static  void  main (String[] args)
    {
        int n = 2;
        int k = 10;
        System.out.print("Minimum number of trials in worst case with " + n + " eggs and " + k + " floors is " + eggDrop(n, k));
    }
    private static int eggDrop(int n, int k) {
        if (k != 0 && k != 1) {
            if (n == 1) {
                return k;
            } else {
//                int result = 0;
                int min = Integer.MAX_VALUE;

                for(int i = 1; i <= k; ++i) {
                    int result = Math.max(eggDrop(n - 1, i - 1), eggDrop(n, k - i));
                    min = Math.min(min, result);
                }

                return min + 1;
            }
        } else {
            return k;
        }
    }


}
