import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {



    public static  void  main (String[] tmep)
    {
            int[] arr= new int[]{1,2,3,4,5,};
        String a[]
                = new String[] { "Arpit", "Bright", "C", "D" };

        // Getting the list view of Array
        List<String> list = Arrays.asList(a);

      List<String> temp =   list.stream().filter(p-> {
           return p=="A";
        }).collect(Collectors.toList());

//      list.stream().flatMap(str ->
//                      Stream.of(str.charAt(2))).
//              forEach(System.out::println);
//
//        long count = list.stream().count();

     Optional<String> reduce  =  list.stream().reduce((a1, b)-> a1+b);


//     list.stream().filter()

        System.out.println(reduce.toString());

    }




}
