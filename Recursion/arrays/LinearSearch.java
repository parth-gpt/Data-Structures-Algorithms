package Recursion.arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 8, 10, 4};
//        ArrayList<Integer> list = new ArrayList<>();
//        search(arr, 3, 0);
//        System.out.println(searchAll(arr, 4, 0, list));
        System.out.println(searchAll2(arr, 4, 0));
    }

    static void search(int[] arr, int target, int index)
    {
        if(index == arr.length)
        {
            System.out.println("Not Found.");
            System.exit(0);
        }
        if(arr[index] == target)
        {
            System.out.println("Found. at index - " + index);
        }
        else{
            search(arr, target, index+1);
        }
    }

    static ArrayList<Integer> searchAll(int[] arr, int target, int index, ArrayList<Integer> list)
    {
        if(index == arr.length)
        {
            return list;
        }

        if(target == arr[index])
        {
            list.add(index);
        }
        return searchAll(arr, target, index+1, list);
    }

    static ArrayList<Integer> searchAll2(int[] arr, int target, int index)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length)
        {
            return list;
        }

        if(target == arr[index])
        {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelow =  searchAll2(arr, target, index+1);

        list.addAll(ansFromBelow);
        return list;
    }
}
