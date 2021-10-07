package Recursion;

public class FirstUpperCase {
    public static void main(String[] args) {
        String s = "geeKsforgeeKs";
        System.out.println(search(s, 0));
    }

    static String search(String s, int start)
    {
        if(start>=s.length())
        {
            return "Not Found";
        }

        if(Character.isUpperCase(s.charAt(start)))
        {
            char ans = s.charAt(start);
            return Character.toString(ans);
        }
        start++;
        return search(s, start);
    }
}
