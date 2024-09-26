package Exemplo;

import static java.lang.Thread.sleep;

public class main {
    public static void main(String[] args) throws InterruptedException {

        DataBaseConnection dbConnection =  DataBaseConnection.getInstance("mySQL: 8000");

        dbConnection.connect();

        sleep(3000);

        dbConnection.disconnect();
    }
}
