package Exemplo;

public class DataBaseConnection {

    private static DataBaseConnection instance;
    private String connectionString;

    public DataBaseConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    public static DataBaseConnection getInstance(String connectionString) {
        if (instance == null) {
            instance = new DataBaseConnection(connectionString);
        }
        return instance;
    }

    public void connect() {
        System.out.println("Database connection Sucessful: " + this.connectionString);
    }

    public void disconnect() {
        System.out.println("Database connection turned off: " + this.connectionString);
    }
}
