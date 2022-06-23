//Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
//
//        Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
//
//        Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
//
//        Return the minimum integer k such that she can eat all the bananas within h hours.

//Input: piles = [3,6,7,11], h = 8
//        Output: 4
//        Input: piles = [30,11,23,4,20], h = 5
//        Output: 30
public class KokoBannana {


    public static void main(String[] a) {
        int[] piles = new int[]{3, 6, 7, 11};
        int h = 8;

        int min = 1; // k can be less then minimum value of piles[i]
        int max = Integer.MIN_VALUE;
        for (int i : piles) {

            max = Math.max(max, i);

        }
        while (min < max) {
            int mid = min + (max - min) / 2;
            if (checkPiles(piles, h, mid)) {
                max = mid;
            } else {
                min = mid + 1;
            }

        }
        System.out.println(min);
    }

    private static boolean checkPiles(int[] piles, int h, int value) {

        int count = 0;

        for (int i : piles) {
            if (i % value != 0) {
                count = count + (i / value) + 1;
            } else {
                count = count + (i / value);
            }


        }

        return count <= h;
    }
}
