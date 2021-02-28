/*
1259 - Palindrome number
https://www.acmicpc.net/problem/1259
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Problem1259 {
    static List<String> numbersInStr = new ArrayList<>();

    public static void main(String[] args){
        getInput();

        for(String numberInStr : numbersInStr){
            if(isPalindrome(numberInStr)) System.out.println("yes");
            else System.out.println("no");
        }
    }

    static boolean isPalindrome(String str){
        int n = str.length();
        boolean result = true;
        for(int i = 0; i < n / 2; i++){
            if(str.charAt(i) != str.charAt(n - 1 - i)){
                result = false;
                break;
            }
        }
        return result;
    }

    static void getInput(){
        Scanner sc = new Scanner(System.in);
        String numberInStr;
        while(true){
            numberInStr = sc.nextLine();
            if(numberInStr.equals("0")) break;
            numbersInStr.add(numberInStr);
        }
    }
}
