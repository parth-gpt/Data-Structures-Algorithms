package BinarySearch;
import java.util.*;

public class NDoubleExistCheck {
    public static void main(String[] args) {
        int[] arr = {-2,0,10,-19,4,6,-8};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            int index = binarySearch(arr, 2*arr[i]);
            if(index != i && index != -1)
            {
                return true;
            }
        }
        return false;
    }

    static int binarySearch(int[] arr, int target)
    {
        int s = 0;
        int e = arr.length -1;
        while(s <= e)
        {
            int mid = s + (e - s) / 2;

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
