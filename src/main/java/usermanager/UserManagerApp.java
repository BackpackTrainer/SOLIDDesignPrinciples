package usermanager;

import java.util.List;

public class UserManagerApp {
    public static void main(String[] args) {
        try {
            String filepath = "src/main/resources/users.txt";
            userManager.UserFileReader reader = new userManager.UserFileReader(filepath);
            userManager.UserFileWriter writer = new userManager.UserFileWriter(filepath);
            userManager.UserOperations operations = new userManager.UserOperations(reader, writer);

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

