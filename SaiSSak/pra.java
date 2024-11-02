package SaiSSak;

import java.util.Scanner;

public class pra {

    public static int Op(int a, int b){
        int sum = (a+b)*(a-b);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1=sc.nextInt();
        int num2=sc.nextInt();

        System.out.println(Op(num1,num2));
    }
}
