package Ex02Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance;
    private String myLogger;

    private Logger(String myLogger){
        this.myLogger = myLogger;
    }
    public static synchronized Logger getInstance(String myLogger){
        if (instance == null){
            instance = new Logger(myLogger);
        }
        return instance;
    }
    public void log(String logger){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Ficha01/Ex02Logger/application_log.txt.docx", true))){
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            writer.write(timestamp + " - " + logger);
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
