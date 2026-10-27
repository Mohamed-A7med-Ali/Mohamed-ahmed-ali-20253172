import java.util.Scanner;

public class Main {

    public static String maskEmail(String email) {
        email = email.trim();

        int at = email.indexOf('@');

        if (at == -1) {
            return "Invalid Email";
        }

        String username = email.substring(0, at);
        String domain = email.substring(at + 1).toLowerCase();

        if (username.length() <= 2) {
            return username + "@" + domain;
        }

        String masked = username.substring(0, 2);

        for (int i = 2; i < username.length(); i++) {
            masked += "*";
        }

        return masked + "@" + domain;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = s.nextLine();

        System.out.println(maskEmail(email));
    }
}