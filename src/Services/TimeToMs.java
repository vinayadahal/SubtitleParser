package Services;

public class TimeToMs {

    public int milliSec(String time) {
        String[] SplittedTime = time.split(":");
        int ms = Integer.parseInt(SplittedTime[2]) * 1000;
        ms = ms + (Integer.parseInt(SplittedTime[1]) * 60) * 1000;
        ms = ms + ((Integer.parseInt(SplittedTime[0]) * 60) * 60) * 1000;
        return ms;
    }

    public String srtTimeFormatter(long duration) {
        long second = (duration / 1000) % 60;
        long minute = (duration / (1000 * 60)) % 60;
        long hour = (duration / (1000 * 60 * 60)) % 24;
        long msec = (duration - (second * 1000));
        return String.format("%02d:%02d:%02d,%02d", hour, minute, second, msec);
    }

}
