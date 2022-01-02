package text;

import java.util.Date;

public class text9_3 {
    public static void main(String[] args) {
        Date date = new Date();
        long time = 10000;
        for (int i = 1; i <= 8; i++) {
            date.setTime(time);
            System.out.println(date.toString());
            time *= 10;
        }
    }
}
