package userManager;

import java.io.IOException;
import java.util.List;

public class UserOperations {
    private userManager.UserFileReader reader;
    private userManager.UserFileWriter writer;

    public UserOperations(userManager.UserFileReader reader, userManager.UserFileWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public List<String> readUsers() throws IOException {
        return reader.readUsers();
    }

    public void addUser(String user) throws IOException {
        List<String> users = reader.readUsers();
        users.add(user);
        writer.writeUsers(users);
    }

    public void removeUser(String user) throws IOException {
        List<String> users = reader.readUsers();
        users.remove(user);
        writer.writeUsers(users);
    }
}

