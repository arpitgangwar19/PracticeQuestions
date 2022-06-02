public class ArrangingCoin {

    public static void main(String[] a)
    {
        System.out.println(count(10,1));
    }


 public static int count(int n,int row)
    {

        if(n>row+1)
        { row++;
            return count(n-row,row);}
        else return row;
//        if(n-row<=row+1)
//            return row;
//        else {
//            return count(n-row,row+1);
//        }
    }
}
