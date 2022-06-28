//import java.util.LinkedHashMap;
//
//public class LongestHappyString {
//
//
//    public  static void  main(String[] args)
//    {
//        int a=7;
//        int b = 1;
//        int c = 1;
//        String result = longestDiverseString(a,b,c);
//    }
//
//    public static String longestDiverseString(int a, int b, int c) {
//
//        // LinkedHashMap<Integer, String> lhmap =
//        //          new LinkedHashMap<Integer, String>();
//        LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
//        char min,max,mid;
//        if(a>b && a>c)
//        {
//            // map.put('a',a);
//            max='a';
//            map.put('a',a);
//            if(b>c)
//            {
//                map.put('b',b);
//                map.put('c',c);
//                mid='b';
//                min='c';
//
//            }
//            else{
//                map.put('c',c);
//                map.put('b',b);
//
//                mid='c';
//                min='b';
//
//            }
//        }
//        if(b>a && b>c)
//        {
//            map.put('b',b);
//            max='b';
//            if(a>c)
//            {
//                map.put('a',a);
//                map.put('c',c);
//                mid='a';
//                min='c';
//
//            }
//            else{
//
//                map.put('c',c);
//                map.put('a',a);
//                mid='c';
//                min='a';
//
//            }
//        }
//        if(c>a && c>b)
//        {
//            map.put('c',c);
//            max='c';
//            if(b>a)
//            {
//                map.put('b',b);
//                map.put('a',a);
//                mid='b';
//                min='a';
//
//            }
//            else{
//                map.put('a',a);
//                map.put('b',b);
//
//                mid='a';
//                min='b';
//
//            }
//        }
//        StringBuilder result=new StringBuilder("");
//        int i =0;
//        while(map.get(map.size())!=0 && map.get(map.size()-1)!=0 )
//        {
//
//        }
//
//        for(int )
//
//    }
//}
