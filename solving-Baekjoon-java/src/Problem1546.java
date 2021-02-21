/*
1546 - Average
https://www.acmicpc.net/problem/1546
*/

import java.util.Scanner;

public class Problem1546 {
    static int[] scores;

    public static void main(String[] args){
        getInput();

        int maxScore = 0;
        for(int score : scores){
            if(maxScore < score) maxScore = score;
        }

        double sum = 0;
        for(int score : scores){
            sum += (double)score / maxScore * 100;
        }

        System.out.println(sum / scores.length);
    }

    static void getInput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        scores = new int[n];
        for(int i = 0; i < n; i++){
            scores[i] = sc.nextInt();
        }
        sc.nextLine();
    }
}
