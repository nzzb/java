package text;

import java.util.Random;
import java.util.Arrays;
//text StopWatch
public class text9_6 {
    public static void main(String[] args) {
        StopWatch time = new StopWatch();
        time.start();
        Random x = new Random(1000);
        int[] num = new int[100010];
        for (int i = 0; i < 100000; i++) {
            num[i] = x.nextInt(100000);
        }
        Arrays.sort(num, 0, 100000);
        time.stop();
        System.out.println(time.getstartTime() + " " + time.getendTime());
        System.out.println(time.getElapsedTime() + "ms");
    }
}
