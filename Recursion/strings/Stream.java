package Recursion.strings;


public class Stream {
    public static void main(String[] args) {
//        skipA("baccad", "", 0);
//        System.out.println(skipA1("baccad"));
//        System.out.println(skipApple("bdapplefd"));
        System.out.println(skipAppNotApple("bdapplcf"));
    }

    //    Method-1
    static void skipA(String s, String ans, int i)
    {
        if(i == s.length())
        {
            System.out.println(ans);
            return;
        }
        if(s.charAt(i) != 'a')
        {
            ans += s.charAt(i);
        }
        skipA(s, ans, i+1);
    }

    //    Method-2
    static String skipA1(String s)
    {
        if(s.isEmpty())
        {
            return "";
        }

        char ch = s.charAt(0);
        if (ch == 'a')
        {
            return skipA1(s.substring(1));
        }
        else{
            return ch + skipA1(s.substring(1));
        }
    }

    static String skipApple(String s)
    {
        if(s.isEmpty())
        {
            return "";
        }
        if (s.startsWith("apple"))
        {
            return skipApple(s.substring(5));
        }
        else{
            return s.charAt(0) + skipApple(s.substring(1));
        }
    }

    static String skipAppNotApple(String s)
    {
        if(s.isEmpty())
        {
            return "";
        }
        if (s.startsWith("app") && !s.startsWith("apple"))
        {
            return skipAppNotApple(s.substring(3));
        }
        else{
            return s.charAt(0) + skipAppNotApple(s.substring(1));
        }
    }
}
