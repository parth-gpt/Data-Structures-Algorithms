package linear_search;

import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {
        String s = "Hello";
        s = s.toLowerCase();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter letter to be found - ");
        char target = sc.next().charAt(0);
        search(s, target);
    }
    static void search(String s, char target)
    {
        if(s.length() == 0)
        {
            System.out.println("String Empty!");
        }
        char[] ch = s.toCharArray();
        int i;
        for(i=0;i<ch.length;i++)
        {
            if(ch[i] == target)
            {
                System.out.println("Letter Found. At index - " + i);
                break;
            }
        }
        if(i == ch.length)
        {
            System.out.println("No such letter exist in the given string.");
        }
    }
}
