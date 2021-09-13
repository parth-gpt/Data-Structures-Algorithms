package linear_search;

import java.util.Scanner;

public class LinearSearch {

    static void linearSearch(int num, int[] arr)
    {
        if(arr.length == 0)
        {
            System.out.println("Array Empty!");
        }
        int i;
        for (i=0;i< arr.length;i++) {
            if(arr[i] == num)
            {
                System.out.println("Number Found. At index - " + i);
                break;
            }
        }
        if(i == arr.length)
        {
            System.out.println("Number doesn't exist in the given array.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 14, 77, 50};

        System.out.println("Enter number to be found - ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        linearSearch(num, arr);
    }
}
