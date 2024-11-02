package SaiSSak;

import java.util.Scanner;

public class Array_Count {
    //10807번
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt(); //배열 크기
        int[] arr = new int[Num];   //배열 선언

        for (int i=0; i < Num; i++){
            arr[i] = sc.nextInt();  // 값을 받아서 배열 초기화
        }

        int T = sc.nextInt();   //찾는 수 받기

        int Sum=0;

        for(int j=0; j< Num; j++){
            if(arr[j]==T){
                Sum+=1;
            }
        }

        System.out.println(Sum);
    }
}
