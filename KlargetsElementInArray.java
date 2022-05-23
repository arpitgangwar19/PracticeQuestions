import java.util.*;

public class KlargetsElementInArray {

    public static void main(String[] args)
    {
//        min = new PriorityQueue<>();

     int    k = 4;

        int arr[] = { 1, 2, 3, 4, 5, 6 };

         getAllKthNumber(arr);

//        for (int x : res)
//            System.out.print(x + " ");
    }

    private static void getAllKthNumber(int[] arr) {


        Queue<Integer> queue = new PriorityQueue<Integer>(new CustomIntegerComparator());
//        queue.addAll(arr);
       for (int i=0;i< arr.length;i++)
       {
           queue.add(arr[i]);
       }

        queue.stream().forEach(System.out::println);

    }

    public  static  class CustomIntegerComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1>o2?1:-1;
        }

    }
}
