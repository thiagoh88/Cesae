package Tools;

import Model.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CsvUsersReader {

    public static ArrayList<User> readCsvFileToUsersArray(String filePath) {

        ArrayList<User> usersArray = new ArrayList<>();
        try{
            File usersFile = new File(filePath);
            Scanner usersScanner = new Scanner(usersFile);
            usersScanner.nextLine();
            while (usersScanner.hasNextLine()) {
                String linhaAtual = usersScanner.nextLine();
                String[] linhaDividida = linhaAtual.split(",");
                String loginType = linhaDividida[0];
                String username = linhaDividida[1];
                String password = linhaDividida[2];
                User userAtual = new User(loginType, username, password);
                usersArray.add(userAtual);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return usersArray;
    }
}
