public enum EnumPractice {

    A('a', 'A'),
    B('b', 'B'),
    C('c', 'C');
    private  final  char para1;
    private  final  char para2;


    EnumPractice(char para1, char para2) {
        this.para1 = para1;
        this.para2 = para2;
    }
    public  char getPara1()
    {
        return para1;
    }

    public  char getPara2()
    {
        return para2;
    }
}
class  Practice
{
    public static void main(String[] a)
    {
        System.out.println(EnumPractice.A);
    }
}
