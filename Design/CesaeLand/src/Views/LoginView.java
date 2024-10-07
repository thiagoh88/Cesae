package Views;

import Controllers.LoginController;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoginView {
    private LoginController loginController;

    public LoginView() {
        this.loginController = new LoginController();
    }

    public void menu() {

        Scanner sc = new Scanner(System.in);

        int op;

        do {
            System.out.println("Bem-vindo ao CesaeLand\n1.Cliente\n2.Login\n3.Sair");
            System.out.print("Opção: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    ClientView cv = new ClientView();
                    cv.menu();
                    break;
                case 2:
                    menuLogin();
                    break;
                case 3:
                    System.out.println("Obrigado.");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        } while (op != 3);
    }

    private void menuLogin() {
        Scanner sc = new Scanner(System.in);

        String user, password;
        System.out.print("USER: ");
        user = sc.nextLine();
        System.out.print("PASSWORD: ");
        password = sc.nextLine();

        switch (loginController.validateLogin(user, password)) {
            case 0:
                System.out.println("Acesso Inválido");
                break;
            case 1:
                AdminView av = new AdminView();
                av.menu();
                break;
            case 2:
                EngView ev = new EngView();
                ev.menu();
                break;
        }

    }
}