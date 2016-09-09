package subtitleparser;

import Services.FileLoader;
import Services.ParseSrt;
import Services.TimeToMs;
import java.io.IOException;

public class SubtitleParser {

    public static void main(String[] args) throws IOException {
//        String fileName = args[0];
//        String time = args[1];
        StringBuilder text = new FileLoader().loadSrt("D:\\sub.srt");
        new ParseSrt().parse(text, new TimeToMs().srtTimeFormatter(57000));
    }

}
