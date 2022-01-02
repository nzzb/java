package text;

import java.util.Date;

public class StopWatch {
    private long startTime = 0, endTime = 0;
    Date date = new Date();

    public StopWatch() {
        startTime = 0;
    }

    public void start() {
        startTime = date.getTime();
    }

    public void stop() {
        endTime = date.getTime();
    }

    public long getstartTime() {
        return this.startTime;
    }

    public long getendTime() {
        return this.endTime;
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

}
