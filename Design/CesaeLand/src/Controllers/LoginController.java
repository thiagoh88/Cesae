package Controllers;

import Model.User;
import Repositories.UsersRepository;

import java.io.FileNotFoundException;

public class LoginController {

    private UsersRepository usersRepository;

    public LoginController() {
        this.usersRepository = UsersRepository.getInstance();
    }

    public int validateLogin(String usernameInput, String passwordInput) {

        for (User userAtual : usersRepository.getUsersArray()) {
            if (usernameInput.equals(userAtual.getUsername()) && passwordInput.equals(userAtual.getPassword())) {

                if (userAtual.getLoginType().equalsIgnoreCase("ADMIN")) {
                    return 1;
                }
                if (userAtual.getLoginType().equalsIgnoreCase("ENG")) {
                    return 2;
                }
            }
        }
        return 0;
    }
}
