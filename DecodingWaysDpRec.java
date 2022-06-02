public class DecodingWaysDpRec {

    public static void main(String[] args)
    {
//        char digits[] = {'1','2','3','4'};
        char digits[] = {'2','5','1','1','4'};
        int n = digits.length;
        System.out.println("Count is " +
                countDecodingDP(digits, n));
    }
     //Bottom up
    private static int countDecodingDP(char[] digits, int n) {

        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        if(digits[0]=='0')   //for base condition "01123" should return 0
            return 0;
        for(int i =2;i<=n;i++)
        {
            dp[i] = 0;

            if(digits[i-1]>'0')
            {
                dp[i] = dp[i-1];

            }
            if(digits[i-2]=='1' || (digits[i-2]=='2' && digits[i-1]<'7') )
            {
                dp[i] = dp[i] +dp[i-2];

            }

        }
        return dp[n];
    }
}
