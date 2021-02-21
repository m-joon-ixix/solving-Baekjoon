/*
2577 - Count of each Number
https://www.acmicpc.net/problem/2577
*/

import java.util.Scanner;

public class Problem2577 {
    static int a, b, c;

    public static void main(String[] args) {
        getInput();

        String multipleStr = Integer.toString(a * b * c);
        int[] counts = new int[10];
        for(int i = 0; i < multipleStr.length(); i++){
            counts[multipleStr.charAt(i) - '0']++;
        }

        for(int count : counts) System.out.println(count);
    }

    static void getInput(){
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        sc.nextLine();
        b = sc.nextInt();
        sc.nextLine();
        c = sc.nextInt();
        sc.nextLine();
    }
}
