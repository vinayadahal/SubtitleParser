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

//                System.out.println("StartTIME:::: " + startTime);
//                System.out.println("StopTIME:::: " + stopTime);
                StringBuilder sb = new StringBuilder();
                if (startTime.trim().equals(videoTime)) {
                    int j = 1;
                    while (!subtitleArray[i + j].contains("-->")) {
                        if (subtitleArray[i + j].equals("")) {
                            break;
                        } else {
                            if (subtitleArray[(i + j) - 1].contains("\n") && !subtitleArray[(i + j) - 1].contains("-->")) {
                                sb.append(subtitleArray[i + j]);
                            } else {
                                sb.append(subtitleArray[i + j]);
                                sb.append("\n");
                            }
                            System.out.println("Subtitle::::: " + subtitleArray[i + j]);
                        }
                        j++;
                    }
                    System.out.println("FINAL LINE:::: " + sb.toString());
                    break;
                } else if (stopTime.trim().equals(videoTime)) {
                    System.out.println("FOUND END TIME::::: nothing to show");
                }
            }
        }
    }

}
