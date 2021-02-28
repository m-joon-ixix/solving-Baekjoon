/*
1181 - Sorting Words
https://www.acmicpc.net/problem/1181
*/

import java.util.Arrays;
import java.util.Scanner;

public class Problem1181 {
    static int n;
    static Word[] words;

    public static void main(String[] args){
        getInput();

        Arrays.sort(words);
        String prevWord = "";
        for(Word word : words){
            if(prevWord.equals(word.word)) continue;
            System.out.println(word.word);
            prevWord = word.word;
        }
    }

    static void getInput(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();

        words = new Word[n];
        for(int i = 0; i < n; i++){
            words[i] = new Word(sc.nextLine());
        }
    }
}

class Word implements Comparable<Word>{
    String word;

    Word(String str){
        this.word = str;
    }

    @Override
    public int compareTo(Word other){
        if(this.word.length() > other.word.length()) return 1;
        else if(this.word.length() < other.word.length()) return -1;
        else return this.word.compareTo(other.word);
    }
}
