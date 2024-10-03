package Ex01DataBase;

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private String connectionString;

    private DatabaseConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    public static synchronized DatabaseConnection getInstance(String connectionString) {
        if (instance == null) {
            instance = new DatabaseConnection(connectionString);
        }
        return instance;
    }

    public void connect() {
        System.out.println("Conectado" + this.connectionString);
    }

    public void disconnect() {
        System.out.println("Desconectado" + this.connectionString);
    }
}
