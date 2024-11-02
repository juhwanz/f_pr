package SaiSSak;

import java.util.Scanner;

//2738번
public class Matrix_cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;

        //System.out.print("배열의 크기 입력");
        n = sc.nextInt();
        m = sc.nextInt();

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];



        //System.out.println("배열1의 값 입력");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("배열2의 값 입력");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
