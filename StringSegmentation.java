import java.util.HashSet;
import java.util.Set;

public class StringSegmentation {







    public static void main(String[] args) {
        Set< String > dictionary = new HashSet< String >();
        String s = new String();
        s = "arpitgangwar";

        dictionary.add("arpit");
        dictionary.add("gang");
        dictionary.add("war");
        if (canSegmentString(s, dictionary)) {
            System.out.println("String Can be Segmented");
        } else {
            System.out.println("String Can NOT be Segmented");
        }}

    private static boolean canSegmentString(String s, Set<String> dictionary) {
        int i =0;
        while(i<s.length())
        {
            if(dictionary.contains(s.substring(0,i)))
            {
                if( s.substring(i)==null || s.length()==0 || dictionary.contains(s.substring(i)) || canSegmentString(s.substring(i),dictionary))
                {
                    return  true;
                }
            }
            i++;
        }

        return false;
    }

}
