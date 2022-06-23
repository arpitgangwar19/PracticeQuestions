//Given an array nums which consists of non-negative integers and an integer m, you can split the array into m non-empty continuous subarrays.
//
//        Write an algorithm to minimize the largest sum among these m subarrays.

//Input: nums = [7,2,5,10,8], m = 2
//        Output: 18
//        Explanation:
//        There are four ways to split nums into two subarrays.
//        The best way is to split it into [7,2,5] and [10,8],
//        where the largest sum among the two subarrays is only 18.
public class SplitArrayLargestSum {

    public static void main(String[] a) {
        int[] nums = new int[]{1, 4, 4};
        int m = 1;

        int result = findLasgestByBinaryMethod(nums, m);
        System.out.println(result);
    }

    private static int findLasgestByBinaryMethod(int[] nums, int m) {

        int max = Integer.MIN_VALUE;
        int sum = 0;
        int result = 0;
        for (int i : nums) {
            max = Math.max(max, i);
            sum = sum + i;
        }
        while (max < sum) {
            int mid = max + (sum - max) / 2;

            if (check(nums, mid) <= m) {
                sum = mid;
                result = mid;
            } else {
                max = mid + 1;
            }
        }
        return result;
    }

    private static int check(int[] nums, int mid) {
        int sum = 0;
        int splits = 0;
        for (int i : nums) {
            if (sum + i <= mid) {
                sum = sum + i;
            } else {
                splits++;
                sum = i;
            }
        }
        return splits + 1;
    }
}
