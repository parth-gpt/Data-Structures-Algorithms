package binary_search;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {-12, -6, 3, 5, 6, 4, 1, -10};
        findPeak(arr);
    }
    static void findPeak(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start != end)
        {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1])
            {
                end = start;
            }
            else if(arr[mid] < arr[mid+1])
            {
                start = mid + 1;
            }
        }
        System.out.println("Peek found at - " + start + " and Peek is - " + arr[start]);
    }
}
