import java.util.HashMap;

public class ConvertString {

    public static void  main(String[] a)
    {
        String s = "innut";
        String t = "ouuut";
      boolean result = findSteps(s,t,10);

    }

    private static boolean findSteps(String s, String t, int k) {
        HashMap<Integer, Integer> mp=new HashMap();
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            int temp = 0;
            if((int)(s.charAt(i))<(int)(t.charAt(i))){
                temp = (int)(t.charAt(i))-(int)(s.charAt(i));
                if(!mp.containsKey(temp))mp.put(temp,1);
                else mp.put(temp,mp.get(temp)+1);
            }
            else if((int)(s.charAt(i))>(int)(t.charAt(i))){
                temp = 26 - s.charAt(i) + t.charAt(i);
                if(!mp.containsKey(temp))mp.put(temp, 1);
                else mp.put(temp,mp.get(temp)+1);
            }
            else continue;
        }
        for(int i:mp.keySet()){
            int fre = mp.get(i);
            int temp = i + (fre-1)*26;
               if(temp>k)return false;
        }
        return true;
    }

}
