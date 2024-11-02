package 자료구조;

// 첫 번째 인덱스를 저장해놓고, 다음 인덱스부터 첫 인덱스와 비교하면서 min(index)설정, i값과 min인덱스 변경


public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {69, 10, 30, 2, 16, 8, 31, 22};

        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                    min = j;
                }
            }

            int temp;
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
