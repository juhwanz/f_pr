package 자료구조;

import java.util.*;
public class _1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int M = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {

            //찾는 값 존재 1, 없을 0
            if(binarySearch(arr, sc.nextInt())>=0){
                sb.append(1).append('\n');
            }
            else{
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int binarySearch(int[] arr, int key){

        int lo = 0;             // 탐색 범위의 왼쪽 끝 인덱스
        int hi = arr.length -1; // 탐색 범위의 오른쪽 끝 인덱스

        // lo가 hi보다 커지기 전까지 반복한다
        while(lo<= hi){

            int mid = (lo+hi)/2; // 중간 위치

            if(key < arr[mid]){
                hi = mid -1;
            }

            else if(key>arr[mid]){
                lo = mid +1;
            }

            else {
                return mid;
            }
        }

        return -1;

    }
}
