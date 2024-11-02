package SaiSSak;

import java.util.Scanner;

public class Loop_AplusB {
    //10950
    //첫 째 줄 5
    //5개의 케이스 덧셈
    //*결과 값을 배열을 저장!

        public static void main(String args[]) {

            Scanner in = new Scanner(System.in);

            int c = in.nextInt();
            int arr[] = new int[c];

            for (int i = 0; i < c; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                arr[i] = a + b;
            }
            in.close();

            for (int k : arr) {
                System.out.println(k);
            }
        }


    }
