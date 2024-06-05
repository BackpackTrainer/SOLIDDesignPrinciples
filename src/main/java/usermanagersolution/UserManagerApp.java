package usermanagersolution;

import java.util.List;

public class UserManagerApp {
    public static void main(String[] args) {
        try {
            String filepath = "src/main/resources/users.txt";
            userManager.UserFileReader reader = new userManager.UserFileReader(filepath);
            UserFileWriter writer = new UserFileWriter(filepath);
            UserOperations operations = new UserOperations(reader, writer);

            operations.addUser("John Doe");
            operations.addUser("Jane Doe");
            operations.removeUser("John Doe");

            List<String> users = operations.readUsers();
            for (String user : users) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

