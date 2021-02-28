/*
2798 - New version of Black Jack
https://www.acmicpc.net/problem/2798
*/

import java.util.Scanner;

public class Problem2798 {
    static int n, m;
    static int[] cards;

    public static void main(String[] args){
        getInput();

        int maxSum = 0, sum;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    sum = cards[i] + cards[j] + cards[k];
                    if(maxSum < sum && sum <= m) maxSum = sum;
                }
            }
        }

        System.out.println(maxSum);
    }

    static void getInput(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        cards = new int[n];
        for(int i = 0; i < n; i++){
            cards[i] = sc.nextInt();
        }
        sc.nextLine();
    }
}