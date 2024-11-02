package SaiSSak;

import java.util.Scanner;

public class Loop_factorial {

    public static void main(String[] args) {

        // 재귀 while문 풀이
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int total = 1;


        while(input!=0){
            total = total*input;
            input--;
        }

        System.out.println(total);



    }

    // 재귀 재귀 풀이
    public static int factorial(int N){
        if(N<=1)
            return 1; // 재귀 종료

        return N*factorial(N-1);
    }

}
