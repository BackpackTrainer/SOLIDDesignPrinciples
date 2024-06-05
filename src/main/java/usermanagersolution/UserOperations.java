package usermanagersolution;

import java.io.IOException;
import java.util.List;

public class UserOperations {
    private UserFileReader reader;
    private UserFileWriter writer;

    public UserOperations(UserFileReader reader, UserFileWriter writer) {
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

