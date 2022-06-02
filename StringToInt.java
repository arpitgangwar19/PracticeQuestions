public class StringToInt {

    public  static void main(String[] abc)
    {
       String test = "-4 3";
     int result =  stringToInt(test);
System.out.println(result);
    }

    private static int stringToInt(String test) {

        String temp = test.replace(" ","");
        Boolean flagNeg = false;
        String temp1;
//        System.out.println(temp);
        if(temp.charAt(0)=='-')
        {
            flagNeg = true;
          temp1 =   temp.replace("-","");
        }
        else {
            temp1=temp;
        }
        int i =0;
        int result = 0;
        while(i<temp1.length())
        {
            int digi = temp1.charAt(i) - '0';
            result = result*10;
            result+=digi;
            i++;
        }


        return flagNeg==true?result*-1:result;
//        return result;
    }

}
