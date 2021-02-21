/*
1157 - Studying Words
https://www.acmicpc.net/problem/1157
*/

import java.util.Scanner;

public class Problem1157 {
    static String word;

    public static void main(String[] args){
        getInput();

        int[] counts = new int[26]; // count of A ~ Z
        for(int i = 0; i < word.length(); i++){
            counts[charToInt(word.charAt(i))]++;
        }

        int maxCount = 0;
        for(int count : counts){
            if(count > maxCount) maxCount = count;
        }

        int maxIdx = -1;
        for(int i = 0; i < 26; i++){
            if(counts[i] == maxCount){
                if(maxIdx == -1) maxIdx = i;
                else {
                    System.out.println("?");
                    return;
                }
            }
        }

        System.out.println((char)('A' + maxIdx));
    }

    // <a or A: 0> ~ <z or Z: 25>
    static int charToInt(char c){
        if(c >= 'a' && c <= 'z') return c - 'a';
        else if(c >= 'A' && c <= 'Z') return c - 'A';
        else return -1;
    }

    static void getInput(){
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
    }
}
