
//Given an array of integers and a sum, the task is to print all subsets of the given array with a sum equal to a given sum.
//Input : arr[] = {2, 3, 5, 6, 8, 10}
//        sum = 10
//        Output : 5 2 3
//        2 8
//        10
//
//        Input : arr[] = {1, 2, 3, 4, 5}
//        sum = 10
//        Output : 4 3 2 1
//        5 3 2
//        5 4 1
public class PerfectSumProblem {
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int sum = 10;
        printAllSubsets(arr, n, sum);
    }

    private static void printAllSubsets(int[] arr, int n, int sum) {


    }

}
