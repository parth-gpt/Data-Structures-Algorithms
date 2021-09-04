package day_2;

import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrome(long num)
    {
        String number = String.valueOf(num);
        char[] ch;
        ch = number.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while (i<j)
        {
            if(ch[i] == ch[j])
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        if(isPalindrome(num))
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
