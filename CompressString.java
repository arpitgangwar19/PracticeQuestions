public class CompressString {


    public static void  main (String[] args)
    {
        String str = "zzzzzzzzzz";
       System.out.println(compress(str,str.length()));
    }

    private static String compress(String str,int n) {
    int count =1;
        StringBuffer sb = new StringBuffer();
        for(int i=1;i<str.length()-1;i++)
        {
            if(str.charAt(i) == str.charAt(i-1))
            {
                count++;
            }
            else {
                sb.append(str.charAt(i-1));
                sb.append("*");
                count= 1;
            }
        }

        if (str.length() > 1)
        {
            //Compare the last two characters of the string
            if (str.charAt(str.length() - 1) == str.charAt(str.length() - 2))
            {
                count++;
            }
            else
            {
                sb.append(str.charAt(str.length() - 2));
                sb.append(count);
                count = 1;
            }
            sb.append(str.charAt(str.length() - 1));
            sb.append("*");
        }

        return sb.toString();
    }
}
