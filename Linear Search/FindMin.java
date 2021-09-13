package linear_search;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 1, 7, -50, -60, 11};
        minSearch(arr);
    }
    static void minSearch(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        int i;
        int index = 0;
        for(i=0;i< arr.length;i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Minimum element is " + min + ". " + "At index - " + index);
    }
}
