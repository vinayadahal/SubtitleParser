package Services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileLoader {

    public StringBuilder loadSrt(String FileLocation) {
        File file = new File(FileLocation);
        BufferedReader br;
        StringBuilder text = new StringBuilder();
        try {
            br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                text.append(line);
                text.append('\n');
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Exception::::: " + ex);
        } catch (IOException ex) {
            System.out.println("Exception::::: " + ex);
        }
        return text;
    }

}
