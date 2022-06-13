public class IncreasingTriplets {


    public static void main(String[] args)
    {
        int[] array= new int[]{1,2,3,4,5};
        System.out.println(increasingTriplet(array));

    }

    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int last = Integer.MAX_VALUE;
        for(int second : nums)
        {
            if(first<=second)
                second= first;
            else if(second<=last)
                last = second;
            else
                return true;
        }
        return false;
    }
}
