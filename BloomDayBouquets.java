//Question : You are given an integer array bloomDay, an integer m and an integer k.
//
//        You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.
//
//        The garden consists of n flowers, the ith flower will bloom in the bloomDay[i] and then can be used in exactly one bouquet.
//
//        Return the minimum number of days you need to wait to be able to make m bouquets from the garden. If it is impossible to make m bouquets return -1.
//
//    Input: bloomDay = [1,10,3,10,2], m = 3, k = 1
//            Output: 3
//            Explanation: Let us see what happened in the first three days. x means flower bloomed and _ means flower did not bloom in the garden.
//            We need 3 bouquets each should contain 1 flower.
//            After day 1: [x, _, _, _, _]   // we can only make one bouquet.
//            After day 2: [x, _, _, _, x]   // we can only make two bouquets.
//            After day 3: [x, _, x, _, x]   // we can make 3 bouquets. The answer is 3.


public class BloomDayBouquets {

    public static void main(String[] sr) {
        int[] bloomDay = new int[]{1, 10, 2, 9, 3, 8, 4, 7, 5, 6};
        int temp = Integer.MAX_VALUE;
        int m = 4;
        int k = 2;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        if (m * k > bloomDay.length)
            System.out.println(min);
        for (int i = 0; i < bloomDay.length; i++) {
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }
        while (min < max) {
            int mid = min + (max - min) / 2;
            if (adjacentWindow(bloomDay, m, k, mid)) {
                max = mid;

            } else {
                min = mid + 1;
            }
        }
        System.out.println(min);
    }

    public static boolean adjacentWindow(int[] nums, int m, int k, int value) {


        int j = 0;
        int counter = 0;

        for (int i : nums) {
            if (i <= value) {
                counter++;
                if (counter == k) {
                    m--;
                    counter = 0;
                    if (m == 0) {
                        return true;
                    }
                }
            } else
                counter = 0;

        }
        return false;
    }
}
