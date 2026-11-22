
class Student {

    private String studentID;
    private String studentName;
    private double GPA;

    public Student(String id, String name, double gpa) {
        studentID = id;
        studentName = name;
        GPA = gpa;
    }

    public Student() {
        studentID = "000";
        studentName = "Unknown";
        GPA = 0.0;
    }

    public void setStudentID(String id) {
        studentID = id;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public void setGPA(double gpa) {
        GPA = gpa;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getGPA() {
        return GPA;
    }

    public boolean isHonorStudent() {
        return GPA >= 3.5;
    }
}

public class problem1 {

    public static void main(String[] args) {

        Student s1 = new Student("101", "Ahmed", 3.7);

        Student s2 = new Student();

        s2.setGPA(3.8);

        System.out.println("Student 1:");
        System.out.println("ID: " + s1.getStudentID());
        System.out.println("Name: " + s1.getStudentName());
        System.out.println("GPA: " + s1.getGPA());
        System.out.println("Honor Student: " + s1.isHonorStudent());

        System.out.println("Student 2:");
        System.out.println("ID: " + s2.getStudentID());
        System.out.println("Name: " + s2.getStudentName());
        System.out.println("GPA: " + s2.getGPA());
        System.out.println("Honor Student: " + s2.isHonorStudent());
    }
}
