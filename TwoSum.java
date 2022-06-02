import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSum {



    public  static void main(String[] abc)
    {
        int[] array = new int[]{2,7,8,10};
        findTwoSum(array,9);

    }

    private static void findTwoSum(int[] array, int target) {

       Map<Integer,Integer> map = new HashMap<>();

        for (int i =0;i<array.length;i++)
        {
            map.put(array[i],i);
        }
        for(int i =0;i<array.length;i++)
        {
            int diff = target-i;

            if(map.get(target-array[i])!=null){
                System.out.println(i+" "+map.get(target-array[i]));

                break;
            }


        }
    }
}
