package Recursion.strings;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        thro("", 8);
        System.out.println(throRet("", 8));
    }

    static void thro(String p, int up)
    {
        if(up == 0)
        {
            System.out.println(p);
            return;
        }

        for(int i=1;i<=up;i++)
        {
            thro(p + i, up - i);
        }
    }

    static ArrayList<String> throRet(String p, int up)
    {
        if(up == 0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for(int i=1;i<=up;i++)
        {
            ans.addAll(throRet(p + i, up - i));
        }

        return ans;
    }
}
