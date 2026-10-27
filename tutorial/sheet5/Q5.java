import java.util.Scanner;

public class Main {

    public static boolean isStrong(String pw) {
        return pw.length() >= 6
                && Character.isUpperCase(pw.charAt(0))
                && pw.indexOf('@') != -1;
    }

    public static String mask(String pw) {
        String result = "" + pw.charAt(0);

        for (int i = 1; i < pw.length(); i++) {
            result = result.concat("*");
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] passwords = new String[4];

        System.out.print("Enter 4 passwords: ");

        for (int i = 0; i < 4; i++) {
            passwords[i] = input.next();
        }

        for (int i = 0; i < 4; i++) {
            if (isStrong(passwords[i])) {
                System.out.println("Password " + (i + 1)
                        + ": Strong (" + mask(passwords[i]) + ")");
            } else {
                System.out.println("Password " + (i + 1)
                        + ": Weak (" + mask(passwords[i]) + ")");
            }
        }
    }
}