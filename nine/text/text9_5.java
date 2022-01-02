package text;

import java.util.GregorianCalendar;

public class text9_5 {
    public static void main(String[] args) {
        GregorianCalendar a = new GregorianCalendar();
        System.out.println(a.get(a.YEAR) + " " + a.get(a.MONTH) + " " + a.get(a.DAY_OF_MONTH));
        a.setTimeInMillis(1234567898765L);
        System.out.println(a.get(a.YEAR) + " " + a.get(a.MONTH) + " " + a.get(a.DAY_OF_MONTH));
    }
}
