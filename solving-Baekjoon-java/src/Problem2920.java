/*
2920 - Music Scale
https://www.acmicpc.net/problem/2920
 */

import java.util.Scanner;

public class Problem2920 {
    static int[] numbers = new int[8];

    public static void main(String[] args){
        getInput();
        validateSequence();
    }

    static void validateSequence(){
        int status; // 1 for ascending, 2 for descending, 3 for mixed
        if(numbers[0] < numbers[1]) status = 1;
        else if(numbers[0] > numbers[1]) status = 2;
        else status = 0; // doesn't happen

        for(int i = 1; i < 7; i++){
            if(status == 1 && numbers[i] >= numbers[i + 1]){
                status = 3;
                break;
            }
            if(status == 2 && numbers[i] <= numbers[i + 1]){
                status = 3;
                break;
            }
        }

        if(status == 1) System.out.println("ascending");
        else if(status == 2) System.out.println("descending");
        else System.out.println("mixed");
    }

    static void getInput(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 8; i++){
            numbers[i] = sc.nextInt();
        }
        sc.nextLine();
    }
}
