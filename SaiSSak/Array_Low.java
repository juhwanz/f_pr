package SaiSSak;

import java.util.Scanner;

// 10871번
public class Array_Low {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n, X;
         n = sc.nextInt();
         X = sc.nextInt();

         int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<X){
                System.out.print(arr[i] + " ");
            }
        }

    }
}
