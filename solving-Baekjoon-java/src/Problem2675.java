/*
2675 - Repeating Strings
https://www.acmicpc.net/problem/2675
*/

import java.util.Scanner;

public class Problem2675 {
    static int[] nArray;
    static String[] strArray;

    public static void main(String[] args){
        getInput();
        for(int i = 0; i < nArray.length; i++){
            repeatString(i);
        }
    }

    static void repeatString(int idx){
        for(int i = 0; i < strArray[idx].length(); i++){
            for(int j = 0; j < nArray[idx]; j++){
                System.out.print(strArray[idx].charAt(i));
            }
        }
        System.out.println();
    }

    static void getInput(){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        nArray = new int[T];
        strArray = new String[T];

        for(int i = 0; i < T; i++){
            nArray[i] = sc.nextInt();
            strArray[i] = sc.nextLine();
            strArray[i] = strArray[i].substring(1);
        }
    }
}
