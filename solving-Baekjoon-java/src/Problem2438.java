/*
2438 - Drawing stars
https://www.acmicpc.net/problem/2438
*/

import java.util.Scanner;

public class Problem2438 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }
    }
}
