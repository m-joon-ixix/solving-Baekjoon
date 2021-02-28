/*
11050 - Binary Coefficient 1 (getting nCk)
https://www.acmicpc.net/problem/11050
*/

import java.util.Scanner;

public class Problem11050 {
    static int n, k;

    public static void main(String[] args){
        getInput();

        System.out.println(factorial(n) / (factorial(n - k) * factorial(k)));
    }

    static int factorial(int n){
        if(n <= 1) return 1;
        return n * factorial(n - 1);
    }

    static void getInput(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        sc.nextLine();
    }
}
