/*
1330 - Comparing two numbers
https://www.acmicpc.net/problem/1330
*/

import java.util.Scanner;

public class Problem1330 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        sc.nextLine();

        String print;
        if(a < b) print = "<";
        else if(a > b) print = ">";
        else print = "==";
        System.out.println(print);
    }
}
