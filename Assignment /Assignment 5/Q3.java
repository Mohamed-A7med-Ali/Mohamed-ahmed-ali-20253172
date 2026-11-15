
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char[][] grid = new char[3][4];

        for (int i = 0; i < 3; i++) {
            String word = in.next();

            for (int j = 0; j < 4; j++) {
                grid[i][j] = word.charAt(j);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Columns: ");

        for (int j = 0; j < 4; j++) {
            String column = "";

            for (int i = 0; i < 3; i++) {
                column = column.concat(String.valueOf(grid[i][j]));
            }

            System.out.print(column + " ");
        }

        int vowels = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                if ("aeiou".indexOf(grid[i][j]) != -1) {
                    vowels++;
                }
            }
        }

        System.out.println("\nVowels: " + vowels);
    }
}
