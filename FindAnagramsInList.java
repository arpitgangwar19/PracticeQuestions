import java.util.ArrayList;
import java.util.List;

public class FindAnagramsInList {


    public static void main(String args[])
    {
        String wordArr[]
                = { "cat", "dog", "tac", "god", "act" };
        int size = wordArr.length;
        printAnagramsTogether(wordArr, size);
    }

    private static void printAnagramsTogether(String[] wordArr, int size) {
        List<String> list = new ArrayList<String>();

//        DupArray dupArray = new DupArray(wordArr, size);
    }
}
