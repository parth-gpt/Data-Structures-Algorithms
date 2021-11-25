package Recursion.ques;


public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        System.out.println(exist(board, "ABCCED"));
    }

    static boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        char[] words = word.toCharArray();
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if (solve(board, words, visited, i, j, 0))
                {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean solve(char[][] board, char[] words, boolean[][] visited, int x, int y, int i) {
        if(i == words.length) {
            return true;
        }

        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length || visited[x][y]) {
            return false;
        }
        if(board[x][y] != words[i]) {
            return false;
        }

        visited[x][y] = true;
        boolean exists =
                solve(board, words, visited, x + 1, y, i + 1) ||
                        solve(board, words, visited, x - 1, y, i + 1) ||
                        solve(board, words, visited, x, y + 1, i + 1) ||
                        solve(board, words, visited, x, y - 1, i + 1);
        visited[x][y] = false;
        return exists;

    }


}
