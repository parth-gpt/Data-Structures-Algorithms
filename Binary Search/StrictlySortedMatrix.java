package binary_search;

import java.util.Arrays;

public class StrictlySortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(search(arr, 9)));
    }
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target)
    {
        while (cStart<=cEnd)
        {
            int mid = cStart + (cEnd-cStart)/2;
            if(matrix[row][mid] == target)
            {
                return new int[]{row, mid};
            }
            if(matrix[row][mid] < target)
            {
                cStart = mid + 1;
            }
            else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target)
    {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1)
        {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while(rStart < (rEnd-1))
        {
            int rMid = rStart + (rEnd - rStart)/2;

            if(matrix[rMid][cMid] == target)
            {
                return new int[]{rMid, cMid};
            }
            if(matrix[rMid][cMid] < target)
            {
                rStart = rMid;
            }
            else{
                rEnd = rMid;
            }
        }
        // Check whether the target is in the column of two rows left.
        if (matrix[rStart][cMid] == target)
        {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target)
        {
            return new int[]{rStart+1, cMid};
        }

        //search in the 1st half
        if(target <= matrix[rStart][cMid-1])
        {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        //search in the 2nd half
        if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1])
        {
            return binarySearch(matrix, rStart, cMid + 1, cols-1, target);
        }
        //search in the 3rd half
        if(target <= matrix[rStart+1][cMid-1])
        {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        //search in the 4th half
        else{
            return binarySearch(matrix, rStart + 1, cMid + 1, cols-1, target);
        }
    }
}
