/*
1085 - Escaping the Rectangle
https://www.acmicpc.net/problem/1085
*/

import java.util.Scanner;

public class Problem1085 {
    static int x, y, w, h;

    public static void main(String[] args){
        getInput();
        System.out.println(minDistance());
    }

    static int minDistance(){
        int toLeft, toRight, toUpper, toLower;
        toLeft = x;
        toRight = w - x;
        toUpper = h - y;
        toLower = y;

        int min1 = Math.min(toLeft, toRight), min2 = Math.min(toUpper, toLower);
        return Math.min(min1, min2);
    }

    static void getInput(){
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        w = sc.nextInt();
        h = sc.nextInt();
        sc.nextLine();
    }
}
