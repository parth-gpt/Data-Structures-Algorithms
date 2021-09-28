package Strings;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "abccdba";

        if(s.equals(check(s))){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    static String check(String s)
    {
        StringBuilder str = new StringBuilder();

        for(int i=s.length()-1;i>=0;i--)
        {
            str.append(s.charAt(i));
        }

        return str.toString();
    }
}
