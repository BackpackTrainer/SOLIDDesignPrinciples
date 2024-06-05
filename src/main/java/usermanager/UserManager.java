package userManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private String filename;

    public UserManager(String filename) {
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

    public void addUser(String user) throws IOException {
        List<String> users = readUsers();
        users.add(user);
        try (FileWriter writer = new FileWriter(filename)) {
            for (String u : users) {
                writer.write(u + "\n");
            }
        }
    }

    public void removeUser(String user) throws IOException {
        List<String> users = readUsers();
        users.remove(user);
        try (FileWriter writer = new FileWriter(filename)) {
            for (String u : users) {
                writer.write(u + "\n");
            }
        }
    }

    public static void main(String[] args) {
        try {
            String filepath = "src/main/resources/users.txt";
            UserManager manager = new UserManager(filepath);
            manager.addUser("John Doe");
            manager.addUser("Jane Doe");
            manager.removeUser("John Doe");

            List<String> users = manager.readUsers();
            for (String user : users) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

