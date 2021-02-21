/*
2739 - Multiplication
https://www.acmicpc.net/problem/2739
*/

import java.util.Scanner;

public class Problem2739 {
    static int n;

    public static void main(String[] args){
        getInput();
        for(int i = 1; i <= 9; i++){
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    static void getInput(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
    }
}
