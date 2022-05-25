public class LongestCommonPalindrome {

    public  static  void  main(String[] args)
    {
        String input = "tit";
        System.out.println("Longest Common Palindrome" +findPalindorme(input));
    }

    private static String findPalindorme(String input) {


        int start = 0;
        int end = 0;
        for(int i=0;i<input.length();i++)
        {

            int len1 = findLengthFromCenter(input,i,i);
            int len2 = findLengthFromCenter(input,i,i+1);
            int len = Math.max(len1,len2);
            if(len>end-start)
            {
                start = i-(len-1)/2;
                end = i+len/2;
            }

        }
        return input.substring(start,end+1);
    }

    private static int findLengthFromCenter(String input, int Start, int End) {

        int start = Start;
        int end = End;
        while(start>=0 && end<=input.length() && input.charAt(start)== input.charAt(end))
        {
            start--;
            end++;
        }
        return end-start+1;
    }


}
