package Repositories;

import Model.User;
import Tools.CsvUsersReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UsersRepository {
    private static UsersRepository instance;
    private ArrayList<User> usersArray;

    private UsersRepository() {
        this.usersArray = CsvUsersReader.readCsvFileToUsersArray("Files/Cesaeland_logins.csv");
    }

    public static UsersRepository getInstance() {
        if (instance == null) {
            instance = new UsersRepository();
        }

        return instance;
    }

    public ArrayList<User> getUsersArray() {
        return usersArray;
    }
}

