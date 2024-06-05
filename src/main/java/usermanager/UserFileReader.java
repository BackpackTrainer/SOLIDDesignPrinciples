package userManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserFileReader {
    private String filename;

    public UserFileReader(String filename) {
        this.filename = filename;
    }

    public List<String> readUsers() throws IOException {
        List<String> users = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                users.add(line);
            }
        }
        return users;
    }
}

