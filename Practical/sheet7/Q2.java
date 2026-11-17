
import java.util.Scanner;

class Student {

    private String studentName;
    private int studentID;
    private double grade;

    // Unparameterized Constructor
    public Student() {
        studentName = "";
        studentID = 0;
        grade = 0;
    }

    // Parameterized Constructor
    public Student(String n, int id, double g) {
        studentName = n;
        studentID = id;
        grade = g;
    }

    // Update Grade
    public void updateGrade(double newGrade) {
        grade = newGrade;
    }

    // Check Pass or Fail
    public boolean isPassed() {
        return grade >= 50;
    }

    // Getters
    public String getStudentName() {
        return studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public double getGrade() {
        return grade;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        Student students[] = new Student[n];

        // Read students information
        for (int i = 0; i < n; i++) {

            input.nextLine();

            System.out.print("Enter student name: ");
            String name = input.nextLine();

            System.out.print("Enter student ID: ");
            int id = input.nextInt();

            System.out.print("Enter student grade: ");
            double grade = input.nextDouble();

            students[i] = new Student(name, id, grade);
        }

        // Update grade
        System.out.print("Enter student index to update: ");
        int index = input.nextInt();

        System.out.print("Enter new grade: ");
        double newGrade = input.nextDouble();

        students[index].updateGrade(newGrade);

        // Display all students
        for (int i = 0; i < n; i++) {

            System.out.println("Name: " + students[i].getStudentName());
            System.out.println("ID: " + students[i].getStudentID());
            System.out.println("Grade: " + students[i].getGrade());

            if (students[i].isPassed()) {
                System.out.println("Status: Passed");
            } else {
                System.out.println("Status: Failed");
            }
        }
    }
}
