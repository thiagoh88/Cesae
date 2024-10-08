package Tools;

import Model.User;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteUsersArrayCsv {
    public static boolean writeUserArrayToCsv(String filePath, ArrayList<User> usersArray) {
        try (FileWriter csvWriter = new FileWriter(filePath)) {

            for (User user : usersArray) {
                csvWriter.append(user.getLoginType())
                        .append(",")
                        .append(user.getUsername())
                        .append(",")
                        .append(user.getPassword())
                        .append("\n");
            }

            csvWriter.flush();
        } catch (IOException e) {
            System.out.println("Erro a escrever  para o CSV Users: " + e.getMessage());
            return false;
        }

        return true;
    }
}
