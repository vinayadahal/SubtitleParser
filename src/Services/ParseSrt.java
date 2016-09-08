package Services;

public class ParseSrt {

    public void parse(StringBuilder text, String videoTime) {
        System.out.println("Video TIME:::: " + videoTime);
        String[] subtitleArray = text.toString().trim().split("\n");
        for (int i = 0; i < subtitleArray.length; i++) {
            if (subtitleArray[i].contains(videoTime)) {
                String[] splittedTime = subtitleArray[i].split("-->");

                String startTime = splittedTime[0].substring(0, splittedTime[0].indexOf(","));
                String stopTime = splittedTime[1].substring(0, splittedTime[1].indexOf(","));

//                System.out.println("STA::::: " + startTime);
//                System.out.println("STO::::: " + stopTime);

//                System.out.println("startTime:::: " + splittedTime[0]);
//                System.out.println("stopTime::::: " + splittedTime[1]);
                if (startTime.trim().equals(videoTime)) {
                    System.out.println("subTitle::::: " + subtitleArray[i + 1]);
                }else if(stopTime.trim().equals(videoTime)){
                    System.out.println("FOUND END TIME::::: nothing to show");
                }

//                if (splittedTime[0].trim().equals(videoTime)) {
//                    System.out.println("Time:::: " + subtitleArray[i]);
//                    System.out.println("Line::: " + subtitleArray[i + 1]);
//                } else if (splittedTime[1].trim().equals(videoTime)) {
//                    System.out.println("This end point");
//                }
            }
        }
    }

}
