import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] students = new String[3][2];

        int countA = 0;
        int countPrefix = 0;

        System.out.println("Enter name and grade for 3 students:");

        for (int i = 0; i < 3; i++) {
            students[i][0] = input.next();
            students[i][1] = input.next();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(
                students[i][0].concat(": ").concat(students[i][1])
            );

            if (students[i][1].equalsIgnoreCase("A")) {
                countA++;
            }
        }

        System.out.println("Students with grade A: " + countA);

        System.out.print("Enter prefix: ");
        String prefix = input.next();

        for (int i = 0; i < 3; i++) {
            if (students[i][0].startsWith(prefix)) {
                countPrefix++;
            }
        }

        System.out.println("Names starting with prefix: " + countPrefix);
    }
}