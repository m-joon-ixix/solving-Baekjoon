/*
2609 - GCD and LCM
https://www.acmicpc.net/problem/2609
*/

import java.util.Scanner;

public class Problem2609 {
    static int a, b;

    public static void main(String[] args){
        getInput();

        int gcd = gcd(a, b);

        System.out.println(gcd);
        System.out.println(a * b / gcd); // a * b = GCD * LCM
    }

    static int gcd(int x, int y){
        int gcd = 1;
        int i = 2;
        while(i <= Math.min(x, y)){
            if(x % i == 0 && y % i == 0){
                x /= i;
                y /= i;
                gcd *= i;
            } else {
                i++;
            }
        }
        return gcd;
    }

    static void getInput(){
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.nextLine();
    }
}
