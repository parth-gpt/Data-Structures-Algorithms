package linear_search;

import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{23, 4, 1}, {18, 12, 3, 9}, {78, 99, 34, 56}, {18, 12}};
        System.out.println("Enter number to be found - ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        search(arr, target);
    }

    static void search(int[][] arr , int target)
    {
        if(arr.length == 0)
        {
            System.out.println("Empty Array!");
        }

        for(int i=0;i< arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j] == target)
                {
                    System.out.println("Number Found. At index - " + i + " " + j);
                    return;
                }
            }
        }
        System.out.println("Number doesn't exist in the given array.");
    }
}
