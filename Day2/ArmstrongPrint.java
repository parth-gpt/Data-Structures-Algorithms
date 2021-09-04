package day_2;

public class ArmstrongPrint {
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
        int last_dig;
        while(o_num != 0)
        {
            last_dig = o_num%10;
            ans = ans + (int) Math.pow(last_dig,count);
            o_num =  o_num/10;
        }
        return ans == p_num;
    }
    public static void main(String[] args) {
        System.out.print("Printing all 3 digit Armstrong Numbers - ");
        for(int num = 100;num<=999;num++)
        {
            if(isArmstrong(num))
            {
                System.out.print(num + " ");
            }
        }
    }
}
