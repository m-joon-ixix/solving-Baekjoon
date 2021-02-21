/*
8958 - OX Quiz
https://www.acmicpc.net/problem/8958
*/

import java.util.Scanner;

public class Problem8958 {
    static String[] testCases;

    public static void main(String[] args){
        getInput();
        for(String quizResult : testCases){
            System.out.println(scoreOfQuiz(quizResult));
        }
    }

    static int scoreOfQuiz(String quizResult){
        int score = 0, continuousWins = 0;
        for(int i = 0; i < quizResult.length(); i++){
            if(quizResult.charAt(i) == 'O'){
                continuousWins++;
                score += continuousWins;
            } else {
                continuousWins = 0;
            }
        }

        return score;
    }

    static void getInput(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        testCases = new String[t];
        for(int i = 0; i < t; i++){
            testCases[i] = sc.nextLine();
        }
    }
}
