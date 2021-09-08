package day_3;

public class MaxElementArray {
    static int max(int[] arr)
    {
        int maxm = 0;
        for (int i =0;i< arr.length;i++)
        {
            for (int j =i+1;j<arr.length;j++)
            {
                if(arr[j] > arr[i])
                {
                    if(arr[j] > maxm) {
                        maxm = arr[j];
                    }
                }
            }
        }
        return maxm;
    }
    public static void main(String[] args) {
        int[] arr = {5,10,4,2,1};
        System.out.println(max(arr));
    }
}
