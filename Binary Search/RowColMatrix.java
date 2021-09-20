package binary_search;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30, 40}, {15, 25, 35, 45}, {28, 29, 37, 49}, {33, 34, 38, 50}};
        search(matrix, 30);
    }
    static void search(int[][] matrix, int target)
    {
        int r = 0;
        int c = matrix.length - 1;

        while(r < matrix.length && c >= 0)
        {
            if(matrix[r][c] == target)
            {
                System.out.println("Element Found. At index - " + Arrays.toString(new int[]{r, c}));
                return;
            }
            if(matrix[r][c]<target)
            {
                r++;
            }
            else {
                c--;
            }
        }
        System.out.println("Given element doesn't exist in the matrix.");
    }

}

