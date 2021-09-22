package Sorting;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        System.out.println("Enter size of Array - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Elements - ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        boolean swapped;
        for(int i=0;i< arr.length;i++)
        {
            swapped = false;
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j-1] > arr[j])
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

        for (int item: arr) {
            System.out.print(item + " ");
        }
    }

}