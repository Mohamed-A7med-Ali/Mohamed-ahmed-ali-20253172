
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] nums = new int[6];

        int sum = 0;
        int count = 0;

        System.out.println("Enter 6 numbers:");

        for (int i = 0; i < 6; i++) {
            nums[i] = in.nextInt();
        }

        System.out.print("Reverse: ");

        for (int i = 5; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

        for (int i = 0; i < 6; i++) {
            if (nums[i] % 2 == 0) {
                sum += nums[i];
            }

            if (nums[i] > nums[0]) {
                count++;
            }
        }

        System.out.println("\nSum of even numbers: " + sum);

        System.out.println("Greater than the first number: " + count);
    }
}
