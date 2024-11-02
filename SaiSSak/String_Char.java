package SaiSSak;

import java.util.*;

public class String_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word;
        int num;

        word = sc.next();
        num = sc.nextInt();

        System.out.println(word.charAt(num-1));

    }
}
