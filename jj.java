import java.util.Scanner;

enum Grade {
    A("Excellent"),
    B("Good"),
    C("Fair"),
    D("Needs Improvement"),
    F("Fail");

    private String message;

    Grade(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static Grade getGrade(int marks) {
        if (marks >= 90 && marks <= 100) {
            return A;
        } else if (marks >= 80) {
            return B;
        } else if (marks >= 70) {
            return C;
        } else if (marks >= 60) {
            return D;
        } else {
            return F;
        }
    }
}


class Student {
    private String name;
    private int marks;
    private Grade grade;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        assignGrade();
    }

    private void assignGrade() {
        this.grade = Grade.getGrade(marks);
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name + " | Marks: " + marks + " | Grade: " + grade + " | Message: " + grade.getMessage());
    }
}

public class jj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student marks: ");
        int marks = scanner.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        } else {
            Student student = new Student(name, marks);
            student.displayInfo();
        }

    }
}


