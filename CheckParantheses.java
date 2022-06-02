import java.util.Stack;

public class CheckParantheses {


    public  static  void main (String[] a)
    {
        System.out.println(checkParantheses("{]}"));
    }





   public static boolean checkParantheses(String s)
    {
        if(s.length()==0  || s.length()==1)
            return false;

        Stack<Character> opening=new Stack();
        Stack<Character> closing=new Stack();

        int i=0;
        while(i<s.length())
        {
            char ch = s.charAt(i);

            if(ch=='('  || ch=='{'  || ch=='[')
            {
                opening.push(ch);

            }
            else if(ch==']' || ch=='}' || ch==')')
            {
                closing.push(ch);

                if(!opening.isEmpty()  && !closing.isEmpty() &&  check(opening.peek(),closing.peek())==true)
                {
                    opening.pop();
                    closing.pop();
                }
                else{
                    return false;
                }
            }
            i++;
        }

        if(opening.isEmpty()  && closing.isEmpty())
            return true;

        return false;
    }

    private static boolean check(char op1, char op2) {
        if(op1=='('  && op2==')')
            return true;
        if(op1=='['  && op2==']')
            return true;
        if(op1=='{'  && op2=='}')
            return true;

        return false;
    }


}
