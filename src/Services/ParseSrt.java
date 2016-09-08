package Services;

public class ParseSrt {

    public void parse(StringBuilder text, String videoTime) {
        System.out.println("Video TIME:::: " + videoTime);
        String[] subtitleArray = text.toString().trim().split("\n");
        for (int i = 0; i < subtitleArray.length; i++) {
            if (subtitleArray[i].contains(videoTime)) {
                String[] splittedTime = subtitleArray[i].split("-->");
                if (splittedTime[0].trim().equals(videoTime)) {
                    System.out.println("Time:::: " + subtitleArray[i]);
                    System.out.println("Line::: " + subtitleArray[i + 1]);
                } else if (splittedTime[1].trim().equals(videoTime)) {
                    System.out.println("This end point");
                }
            }
        }
    }

}
