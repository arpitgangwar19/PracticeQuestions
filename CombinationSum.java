//
//Input : arr[] = 2, 4, 6, 8
//        x = 8
//        Output : [2, 2, 2, 2]
//        [2, 2, 4]
//        [2, 6]
//        [4, 4]
//        [8]




import java.util.ArrayList;
import java.util.List;

public class CombinationSum {





    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);

        int sum = 8;

        List<List<Integer> > ans
                = combinationSum(arr, sum);

        // If result is empty, then
        if (ans.size() == 0) {
            System.out.println("Empty");
            return;
        }

        // print all combinations stored in ans

        for (int i = 0; i < ans.size(); i++) {

            System.out.print("(");
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.print(") ");
        }
    }

    private static List<List<Integer>> combinationSum(ArrayList<Integer> arr, int sum) {

        List<List<Integer>>  result = new ArrayList<>();
        findCombinationByBackTrack(0,arr,new ArrayList(),result,sum);
        return  result;
    }


//    {2,4,6,8}
    private static void findCombinationByBackTrack(int start, ArrayList<Integer> arr, List<Integer> curr, List<List<Integer>> result, int sum) {
        if(sum==0)
        {

            result.add(new ArrayList<>(curr));
        }
        if(sum<0)
        {
            return;
        }
        for(int i =start;i<arr.size();i++)
        {
            curr.add(arr.get(i));
            findCombinationByBackTrack(i,arr,curr,result,sum-arr.get(i));
          curr.remove(curr.size()-1);
//            curr.clear();
        }

//        return null;
    }
}
