/*
11720 - Sum of Numbers
https://www.acmicpc.net/problem/11720
*/

import java.util.Scanner;

public class Problem11720 {
    static int n;
    static String input;

    public static void main(String[] args){
        getInput();

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += (input.charAt(i) - '0');
        }

        System.out.println(sum);
    }

    static void getInput(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        input = sc.nextLine();
    }
}
