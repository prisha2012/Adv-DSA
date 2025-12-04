import java.util.Scanner;

// Custom exception class
class NotLoggedInException extends Exception {
    public NotLoggedInException(String message) {
        super(message);
    }
}

// Student class
class Student {
    String name;
    boolean loggedIn;

    // Constructor
    public Student(String name, boolean loggedIn) {
        this.name = name;
        this.loggedIn = loggedIn;
    }

    // Method to attempt quiz
    public void attemptQuiz() throws NotLoggedInException {
        if (!loggedIn) {
            throw new NotLoggedInException(name + " must log in to attempt quiz");
        } else {
            System.out.println("Quiz started for " + name);
        }
    }
}

public class Notlogged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        String name = sc.nextLine();
        boolean status = sc.nextBoolean();

        // Create student object
        Student s = new Student(name, status);

        try {
            s.attemptQuiz();
        } catch (NotLoggedInException e) {
            System.out.println("NotLoggedInException: " + e.getMessage());
        }

        sc.close();
    }
}
