package day_2;

import java.util.Scanner;

public class MaxMinof3 {

    static void maxOf(int a, int b, int c)
    {
        System.out.println(Math.max((Math.max(a,b)),c));
    }
    static void minOf(int a, int b, int c)
    {
        System.out.println(Math.min((Math.min(a,b)),c));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        maxOf(a,b,c);
        minOf(a,b,c);
    }
}
