/*
10250 - ACM hotel
https://www.acmicpc.net/problem/10250
*/

import java.util.Scanner;

public class Problem10250 {
    static int t;
    static int[] h, w, n;

    public static void main(String[] args){
        getInput();
        for(int i = 0; i < t; i++) System.out.println(getRoomNumber(i));
    }

    static int getRoomNumber(int idx){
        int floor, distFromElev;
        floor = n[idx] % h[idx];
        distFromElev = n[idx] / h[idx] + 1;
        if(floor == 0){
            floor = h[idx];
            distFromElev--;
        }

        return floor * 100 + distFromElev;
    }

    static void getInput(){
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        sc.nextLine();
        h = new int[t];
        w = new int[t];
        n = new int[t];
        for(int i = 0; i < t; i++){
            h[i] = sc.nextInt();
            w[i] = sc.nextInt();
            n[i] = sc.nextInt();
            sc.nextLine();
        }
    }
}
