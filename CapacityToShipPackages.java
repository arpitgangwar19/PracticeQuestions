//Question : A conveyor belt has packages that must be shipped from one port to another within days days.
//
//        The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.
//
//        Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.

//Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
//        Output: 15
//        Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
//        1st day: 1, 2, 3, 4, 5
//        2nd day: 6, 7
//        3rd day: 8
//        4th day: 9
//        5th day: 10
public class CapacityToShipPackages {

    public static void main(String[] args)
    {

        int[] weights = {1,2,3,4,5,6,7,8,9,10 };
        int days = 5;
        int N = weights.length;
        int result=0;
//        shipWithinDays(weight, D, N);

        int min = Integer.MIN_VALUE;
        int sum  =0;
        for(int i=0;i<weights.length;i++)
        {
            min = Math.max(min,weights[i]);
            sum =sum+weights[i];

        }

        while(min<=sum)
        {
            int mid = min+(sum-min)/2;

            if(findLeastWeight(weights,days,mid))
            {
                result=mid;
                sum = mid-1;
            }
            else
            {
                min = mid+1;
            }

        }
//        return min;
        System.out.println(result);
    }

    public  static  boolean findLeastWeight(int[] weights,int days,int value)
    {
        int sum =0;
        int day = 1;
        for(int i : weights)
        {
            sum = sum + i;
            if(sum>value)
            {
                day++;
                sum = i;
            }
            if(day>days)
                return false;
        }
        return true;

    }
}
