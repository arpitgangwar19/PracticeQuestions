import java.net.SocketOption;
import java.util.HashMap;
import java.util.Map;

public class PermutationOfSmallBigString {

    public static void main(String[] ars) {
        String bigString = "kkkkkcbabcacabca";
        String smallString = "abc";
        int result = countPermutations(bigString, smallString);
        System.out.println(result);
    }

    private static int countPermutations(String bigString, String smallString) {
        Map<Character, Integer> bigStringMap = new HashMap<Character, Integer>();
        Map<Character, Integer> smallStringMap = new HashMap<Character, Integer>();
        int lenOfSmallString = smallString.length();
        int result = 0;
        int counter = 0;
        for (int i = 0; i < smallString.length(); i++) {
            smallStringMap.put(smallString.charAt(i), smallStringMap.getOrDefault(smallString.charAt(i), 0) + 1);
        }
        for (int i = 0; i < 3; i++) {
            bigStringMap.put(bigString.charAt(i), bigStringMap.getOrDefault(bigString.charAt(i), 0) + 1);
            if (smallStringMap.get(bigString.charAt(i)) == bigStringMap.get(bigString.charAt(i))) {
                counter++;
            }
        }
        if (counter == 3) {
            result++;
        }
        for (int i = 0; i < bigString.length() - lenOfSmallString; i++) {
            if (smallStringMap.containsKey(bigString.charAt(i + lenOfSmallString)))
                bigStringMap.put(bigString.charAt(i + lenOfSmallString), bigStringMap.getOrDefault(bigString.charAt(i + lenOfSmallString), 0) + 1);
            if (bigStringMap.get(bigString.charAt(i + lenOfSmallString)) == smallStringMap.get(bigString.charAt(i + lenOfSmallString))) {
                counter++;
            }
            if (bigStringMap.get(bigString.charAt(i)) == smallStringMap.get(bigString.charAt(i))) {
                counter--;
            }
            bigStringMap.put(bigString.charAt(i), bigStringMap.getOrDefault(bigString.charAt(i), 0) - 1);
            if (counter == lenOfSmallString)
                result++;
        }


//        cbabcacabca
        return result;
    }
}

