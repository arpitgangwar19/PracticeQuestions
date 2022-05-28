public class FindClosestInSortedArray {


    public static void main(String[] args)
    {
        int arr[] =  {10, 22, 28, 29, 30, 40}, x = 54;
        int n = arr.length;
        printClosest(arr, n, x);
    }

    private static void printClosest(int[] arr, int n, int x) {
        int start=0;
        int end=arr.length-1;
        int result = Integer.MAX_VALUE;
        int first = 0;
        int second = 0;

        while(start<end)
        {
            int temp = Math.abs(arr[start]+arr[end]-x);

            if(temp<result)
            {
                first=start;
                second=end;
                result= temp;
            }
            if(arr[start]+arr[end]>x)
            {
                end--;
            }
            else
                start++;
        }
        System.out.println(arr[first]+" "+ arr[second]);
        System.out.println(result);
    }
}


