package SaiSSak;

import java.util.Scanner;

public class OriginalOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            String str = sc.nextLine();

            System.out.println(str);
        }
        sc.close();
    }
}
