package day_2;

import java.util.Scanner;

public class ArmstrongCheck {
    static boolean isArmstrong(int num)
    {
        int count=0;
        int o_num = num;
        int p_num = num;
        while(num != 0)
        {
            num= num/10;
            count++;
        }
        int ans = 0;
        int last_dig = 0;
        while(o_num != 0)
        {
            last_dig = o_num%10;
            ans = ans + (int) Math.pow(last_dig,count);
            o_num =  o_num/10;
        }
        return ans == p_num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isArmstrong(num))
        {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not Armstrong");
        }
    }
}
