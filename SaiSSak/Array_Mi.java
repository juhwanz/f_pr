package SaiSSak;

import java.util.Arrays;
import java.util.Scanner;

//5579번
public class Array_Mi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 0;
        int[] arr = new int[31];

        for (int i = 0; i < 28; i++) {
            A = sc.nextInt();       //핵심
            arr[A] = 1;
        }

        for(int i = 1 ; i< arr.length; i++){
            if(arr[i]!=1){
                System.out.println(i);
            }
        }
    }
}
