package Recursion.backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
        pathPrint("", 3, 3);
        System.out.println(pathPrintRet("", 3, 3));
        System.out.println(countDiagonal(3, 3));
        pathPrintDiagonal("", 3, 3);
        System.out.println(pathPrintRetDiagonal("", 3, 3));

        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathPrintObs("", 0, 0, board);
    }

    static int count(int r, int c)
    {
        if(r == 1 || c == 1)
        {
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);

        return left + right;
    }

    static void pathPrint(String p, int r, int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(p);
            return;
        }
        if (r == 1)
        {
            pathPrint(p + "R", r, c-1);
        }
        else if (c == 1)
        {
            pathPrint(p + "D", r-1, c);
        }
        else{
            pathPrint(p + "D", r-1, c);
            pathPrint(p + "R", r, c-1);
        }
    }

    static ArrayList<String> pathPrintRet(String p, int r, int c)
    {
        ArrayList<String> left = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();
        if(r==1 && c==1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if (r == 1)
        {
            right = pathPrintRet(p + "R", r, c-1);
        }
        else if (c == 1)
        {
            left = pathPrintRet(p + "D", r-1, c);
        }
        else{
            left = pathPrintRet(p + "D", r-1, c);
            right = pathPrintRet(p + "R", r, c-1);
        }

        left.addAll(right);
        return left;
    }




//    Diagonal Included
    static int countDiagonal(int r, int c)
    {
        if(r == 1 || c == 1)
        {
            return 1;
        }

        int left = countDiagonal(r-1, c);
        int mid = countDiagonal(r-1, c-1);
        int right = countDiagonal(r, c-1);

        return left + mid + right;
    }
    static void pathPrintDiagonal(String p, int r, int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(p);
            return;
        }
        if (r == 1)
        {
            pathPrintDiagonal(p + "H", r, c-1);
        }
        else if (c == 1)
        {
            pathPrintDiagonal(p + "V", r-1, c);
        }
        else{
            pathPrintDiagonal(p + "V", r-1, c);
            pathPrintDiagonal(p + "H", r, c-1);
            pathPrintDiagonal(p + "D", r-1, c-1);
        }
    }

    static ArrayList<String> pathPrintRetDiagonal(String p, int r, int c)
    {
        ArrayList<String> left = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();
        ArrayList<String> mid = new ArrayList<>();

        if(r==1 && c==1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if (r == 1)
        {
            right = pathPrintRetDiagonal(p + "H", r, c-1);
        }
        else if (c == 1)
        {
            left = pathPrintRetDiagonal(p + "V", r-1, c);
        }
        else{
            left = pathPrintRetDiagonal(p + "V", r-1, c);
            right = pathPrintRetDiagonal(p + "H", r, c-1);
            mid = pathPrintRetDiagonal(p + "D", r-1, c-1);
        }

        left.addAll(right);
        left.addAll(mid);

        return left;
    }




//    With Obstacle/ No Diagonal
    static void pathPrintObs(String p, int r, int c, boolean[][] maze)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(!maze[r][c])
        {
            return;
        }
        if (r == maze.length-1)
        {
            pathPrintObs(p + "R", r, c+1, maze);
        }
        else if (c == maze[0].length-1)
        {
            pathPrintObs(p + "D", r+1, c, maze);
        }
        else{
            pathPrintObs(p + "D", r+1, c, maze);
            pathPrintObs(p + "R", r, c+1, maze);
        }
    }
}
