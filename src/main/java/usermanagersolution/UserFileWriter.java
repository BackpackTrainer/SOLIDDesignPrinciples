package usermanagersolution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserFileWriter {
    private String filename;

    public UserFileWriter(String filename) {
        this.filename = filename;
    }

    public void writeUsers(List<String> users) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            for (String u : users) {
                writer.write(u + "\n");
            }
        }
    }

}

