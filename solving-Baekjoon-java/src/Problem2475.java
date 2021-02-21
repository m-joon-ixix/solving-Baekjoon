/*
2475 - Verification Number
https://www.acmicpc.net/problem/2475
*/

import java.util.Scanner;

public class Problem2475 {
    static int[] fiveNumbers = new int[5];

    public static void main(String[] args){
        getInput();

        int sum = 0;
        for(int number : fiveNumbers) sum += (number * number);
        System.out.println(sum % 10);
    }

    static void getInput(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++) fiveNumbers[i] = sc.nextInt();
        sc.nextLine();
    }
}
