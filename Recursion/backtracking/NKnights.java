package Recursion.backtracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(knights(board, 0));
    }

    static int knights(boolean[][] board, int row)
    {
        if(row == board.length)
        {
            display(board);
            return 1;
        }

        int count = 0;
//        placing the knight and checking for every row and col
        for (int col=0; col<board.length; col++)
        {
//            place knight if it is safe
            if(isSafe(board, row, col))
            {
                board[row][col] = true;
                count += knights(board, row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        if (row>=2)
        {
            if (col<board.length-1)
            {
                if (board[row-2][col+1]) {
                    return false;
                }
            }

            if (col>=1)
            {
                if (board[row-2][col-1]) {
                    return false;
                }
            }
        }

        if (row>=1)
        {
            if (col<board.length-2)
            {
                if (board[row-1][col+2]) {
                    return false;
                }
            }

            if (col>=2)
            {
                if (board[row-1][col-2]) {
                    return false;
                }
            }
        }
        return true;
    }

    static void display(boolean[][] board) {
        for(boolean[] row:board)
        {
            for(boolean element:row)
            {
                if (element)
                {
                    System.out.print("K ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

