import java.util.ArrayList;
import java.util.List;

public class AmazonDeliveryPlan {


    public static void main (String[] args)
    {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();

        list.add(1);

        list.add(2);
        lists.add(new ArrayList<>(list));
        list.clear();
        list.add(3);
        list.add(4);
        lists.add(new ArrayList<>(list));
        list.clear();
        list.add(1);
        list.add(-1);
        lists.add(new ArrayList<>(list));
      int numOfDeliveries = 2;
       int result =  diliveryPlan(lists,numOfDeliveries);
    }

//    example : [[1,2],[3,4],[1,-1]]
    private static int diliveryPlan(List<List<Integer>> lists, int numOfDeliveries) {

        List<List<Integer>> result = new ArrayList<>();
      double min = Double.MAX_VALUE;
        for(List<Integer> temp : lists)
        {
             int x =temp.get(0);
             int y = temp.get(1);
             double pow = Math.pow(x,2) + Math.pow(y,2);
             double sqrt = Math.sqrt(pow);
            double diff =  Math.abs(sqrt-numOfDeliveries);

            if(diff<min)
            {
                min = Math.min(min,diff);
                  if(!result.isEmpty())
                  {
                      result.remove(result.size()-1);

                  }
                result.add(temp);

            }
            else if(diff == min)
            {
                result.add(temp);
            }




        }
        System.out.println(result);
        return 0;
    }
}
