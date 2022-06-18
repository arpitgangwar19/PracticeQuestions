import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PolicemanAndTheif {

    public static void main(String[] args)
    {

        char arr1[] = { 'P', 'T', 'T', 'P', 'T' };
        int n = arr1.length;
        int k = 2;
        System.out.println("Maximum thieves caught: " + policeAndThief(arr1, n, k));

        char arr2[] = { 'T', 'T', 'P', 'P', 'T', 'P' };
        n = arr2.length;
        k = 2;
        System.out.println("Maximum thieves caught: " + policeAndThief(arr2, n, k));

        char arr3[] = { 'P', 'T', 'P', 'T', 'T', 'P' };
        n = arr3.length;
        k = 3;
        System.out.println("Maximum thieves caught: " + policeAndThief(arr3, n, k));
    }





    private static int policeAndThief(char[] arr, int n, int k) {

        LinkedHashSet<Integer> police = new  LinkedHashSet<Integer>();
        LinkedHashSet<Integer> theif =new  LinkedHashSet<Integer>();
        LinkedHashSet<Integer> test =new  LinkedHashSet<Integer>();
            int second = test.stream().findFirst().get();

//        {0,3} theif
//        {1,2,4} police
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]=='P')
                police.add(i);
            else
                theif.add(i);
        }
        int count = 0;
        for(int i : police)
        {
            int first = theif.stream().findFirst().get();
            if(Math.abs(i-first)<=k)
            {
                count++;
                theif.remove(first);

            }

//            for (int t : theif)
//            {
//                if(Math.abs(i-t)<=k)
//                {
//                    count++;
//                    theif.remove(t);
//
//                }
//                break;
//            }

        }

        return count;
    }
}
