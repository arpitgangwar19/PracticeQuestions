public class ArmstrongNum {


    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int arm = 0;
       int digit = (int)Math.log10(n) + 1;//for calculating the digits of number
        System.out.println(digit);

        while (n > 0) {

            int rev = n % 10;
//            arm = arm + rev * rev * rev;
            arm = arm +(int) Math.pow(rev,digit);
            n = n / 10;
        }
        System.out.println(arm);
        if (temp == arm)
        {
            System.out.println("armstrong");
        }
        else
        {
            System.out.println("not armstrong");
        }
    }
}
