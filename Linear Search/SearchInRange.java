package linear_search;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 1, 7, 50, 40, 11};

        System.out.println("Enter number to be found - ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter Range: ");
        int range1 = sc.nextInt();
        int range2 = sc.nextInt();
        if(range1>=0 && range2< arr.length)
        {
            search(num, arr, range1, range2);
        }
        else {
            System.out.println("Invalid Range!");
        }
    }
    static void search(int num, int[] arr, int range1, int range2)
    {
        if(arr.length == 0)
        {
            System.out.println("Array Empty!");
        }
        int i;
        for (i=range1;i<=range2;i++) {
            if(arr[i] == num)
            {
                System.out.println("Number Found. At index - " + i);
                break;
            }
        }
        if(i > range2)
        {
            System.out.println("Number doesn't exist in the given range.");
        }
    }
}
