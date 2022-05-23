import java.util.Arrays;

//        The frequency of an element is the number of times it occurs in an array.
//
//        You are given an integer array nums and an integer k. In one operation, you can choose an index of nums and increment the element at that index by 1.
//
//        Return the maximum possible frequency of an element after performing at most k operations.
//Input: nums = [1,2,4], k = 5
//        Output: 3
//leetcode num : 1838
public class FrequencyOfMostFrequentNum {

    public static void main (String[] args)
    {
        int [] a = {1,4,8,13};
        int k = 5;
        System.out.println("Maximum contiguous sum is " +
                maxFrequency(a,k));
        System.out.println("Maximum contiguous sum is " +
                maxFrequencyMethod2(a,k));
    }

    private static int maxFrequencyMethod2(int[] nums, int k) {

        int i =0;
        int j=0;
        int sum=0;
        int result=1;
        Arrays.sort(nums);
        while(j<nums.length)
        {
            sum= sum+nums[j];
            while((nums[j]*(j-i+1))-sum>k)
            {
                System.out.println(sum);
                sum= sum-nums[i];
                i++;

            }
            result =   Math.max(result,(j-i+1));
            j++;

        }
        return result;
    }

    private static int maxFrequency(int[] nums, int k) {
        int result = 1;
            Arrays.sort(nums);

        for(int i=nums.length-1;i>=0;i--)
        {

            int checkSum=1;


            int counter=k;
            for(int  j=i-1;j>=0;j--)
            {
                // System.out.println("j"+nums[j]);
                if(nums[i]==nums[j])
                {
                    checkSum+=1;
                    // System.out.println(nums[i]+" "+counter+" "+nums[j]);
                }
                else if(nums[i]-nums[j]<=counter && counter>0)
                {
                    counter= counter-Math.abs(nums[i]-nums[j]);
                    // System.out.println(nums[i]+" "+counter+" "+nums[j]);
                    // // System.out.println("check"+Math.abs(nums[i]-nums[j]));
                    checkSum+=1;
                    result=Math.max(result,checkSum);
                }

            }
        }


        return result;
    }


}
