package binary_search;

public class InfiniteArray {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(findingRange(arr, target));
    }

    static int findingRange(int[] arr, int target)
    {
        //first start with a box of 2
        int s = 0;
        int e = 1;

        //
        while (target>arr[e])
        {
            // double the box value
            // end = end + 2(size of box)
            int temp = e+1;
            e = e + (e - s + 1) * 2;
            s = temp;
        }
        return binarySearch(arr, target, s, e);
    }

    static int binarySearch(int[] arr, int target, int s, int e)
    {
        while(s <= e)
        {
//            int mid = (s + e) / 2; may exceed the limit of int
            int mid = s + (e - s) / 2;  // better method

            if(target<arr[mid])
            {
                e = mid - 1;
            }
            else if(target>arr[mid])
            {
                s = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
