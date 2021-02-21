/*
10951 - A + B (4)
https://www.acmicpc.net/problem/10951
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Problem10951 {
    static List<String> list = new ArrayList<>();

    public static void main(String[] args){
        getInput();
        for(String str : list) System.out.println(sumOfTwoNumbers(str));
    }

    static int sumOfTwoNumbers(String str){
        String[] split = str.split(" ");
        return Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
    }

    static void getInput(){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            list.add(sc.nextLine());
        }
    }
}
