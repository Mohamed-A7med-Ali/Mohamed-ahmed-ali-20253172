import java.util.Scanner;

public class problem3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        float[] values = new float[n];

        System.out.print("Enter the array elements: ");

        for (int i = 0; i < n; i++) {
            values[i] = input.nextFloat();
        }

        ArrayStatistics a1 = new ArrayStatistics();

        a1.findMaxMin(values);

        System.out.println("Maximum value: " + a1.getMaxValue());
        System.out.println("Minimum value: " + a1.getMinValue());

        input.close();
    }
}