import java.util.*;

public class QueueDataStructureUsingHashMap {

    public static class Structure{
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        List<Integer>  list = new ArrayList<Integer>();

        public void add(int i) {
            if(map.get(i)!=null)
            {
                return;
            }
            int size = list.size();
            list.add(size,i);
            map.put(i,size);
            System.out.println(map);
            System.out.println(list);

        }

        public void remove(int i) {
            int index = map.get(i);
                if(map.get(i)==null)
                    return;
                map.remove(i);
            Integer last = list.get(list.size()-1);
            Collections.swap(list,index,list.size()-1);
            list.remove(list.size()-1);
            map.put(last,index);
            System.out.println(map);
            System.out.println(list);
        }

        public int search(int i) {
            return map.get(i)!=null?map.get(i):-1;
        }
    }
    public static void  main (String[] abc)
    {
        Structure structure = new Structure();
        structure.add(10);
        structure.add(11);
        structure.add(13);
        structure.add(14);
        structure.add(15);
        structure.remove(13);
        System.out.println(structure.search(15));


    }
}
