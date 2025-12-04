import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Superclass
class LogEntry {
    String level;
    String message;

    LogEntry() {
        level = "";
        message = "";
    }
}
class DetailedLog extends LogEntry {

    DetailedLog(String line) {
        extract(line);
    }
void extract(String line) {
        int i = 0;

        // Extract level
        while (i < line.length() && line.charAt(i) != ':') {
            level += line.charAt(i);
            i++;
        }

        // Skip the colon and space
        i += 2;

        // Extract message
        while (i < line.length()) {
            message += line.charAt(i);
            i++;
        }
    }

    void print() {
        System.out.println("Level: " + level + ", Message: " + message);
    }
}


public class logEntry {
    public static void main(String[] args) {
              try {
            BufferedReader br = new BufferedReader(new FileReader("audit.txt"));
            String line;
            int count = 0;

            while ((line = br.readLine()) != null && count < 50) {
                DetailedLog log = new DetailedLog(line);
                log.print();
                count++;
            }

            br.close();
        } catch (IOException e) {
            System.out.println("File not found or error reading file.");
        }  
    }
}
