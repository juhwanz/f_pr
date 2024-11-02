package SaiSSak;

import java.text.SimpleDateFormat;
import java.util.Date;

public class output_Today {

    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Date today = new Date();


        System.out.println(format.format(today));
    }
}
