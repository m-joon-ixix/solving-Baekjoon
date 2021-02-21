/*
2562 - Maximum
https://www.acmicpc.net/problem/2562
*/

import java.util.Scanner;

public class Problem2562 {
    static int[] numbers = new int[9];

    public static void main(String[] args){
        getInput();
        int maxIdx = 0;
        for(int i = 1; i < 9; i++){
            if(numbers[maxIdx] < numbers[i]) maxIdx = i;
        }
        System.out.println(numbers[maxIdx]);
        System.out.println(maxIdx + 1);
    }

    static void getInput(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 9; i++){
            numbers[i] = sc.nextInt();
            sc.nextLine();
        }
    }
}
