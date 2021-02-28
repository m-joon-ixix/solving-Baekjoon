/*
2751 - Sorting Numbers (2)
https://www.acmicpc.net/problem/2751
*/

import java.io.*;

public class Problem2751 {
    static int[] numbers;

    public static void main(String[] args) throws IOException{
        try {
            getInput();
        } catch (IOException e){
            throw e;
        }

        int[] sorted = countSort(numbers);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int number : sorted) bw.write(number + "\n");
        bw.flush();
        bw.close();
    }

    static int[] countSort(int[] array){
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int number : array){
            if(max < number) max = number;
            if(min > number) min = number;
        }

        int maxMinDiff = max - min + 1;
        int[] countArr = new int[maxMinDiff];
        // countArr[i]: count of number i + min
        for(int number : array) countArr[number - min]++;

        int[] sortedArr = new int[array.length];
        int idx = 0;
        for(int i = 0; i < maxMinDiff; i++){
            if(countArr[i] == 1){
                sortedArr[idx] = i + min;
                idx++;
            }
        }

        return sortedArr;
    }

    static void getInput() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        numbers = new int[n];
        for(int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
    }
}
