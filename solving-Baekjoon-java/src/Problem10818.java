/*
10818 - Min & Max
https://www.acmicpc.net/problem/10818
*/

import java.util.Scanner;

public class Problem10818 {
    public static void main(String[] args){
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int number;
        for(int i = 0; i < n; i++){
            number = sc.nextInt();
            if(min > number) min = number;
            if(max < number) max = number;
        }
        sc.nextLine();

        System.out.println(min + " " + max);
    }
}
