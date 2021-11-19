package Recursion.basics;

public class StringLength {
    public static void main(String[] args) {
        String s = "abcdef";
        System.out.println(length(s));
    }

//    static int length(String s, int start)
//    {
//        if(start >= s.length())
//        {
//            return start;
//        }
//        return length(s, start + 1);
//    }
    static int length(String s)
    {
        if(s.equals(""))
        {
            return 0;
        }
        return length(s.substring(1))+1;
    }
}
