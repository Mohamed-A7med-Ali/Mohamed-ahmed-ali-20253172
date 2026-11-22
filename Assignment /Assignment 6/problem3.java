
import java.util.Scanner;

class ArrayStatistics {

    private float maxValue;
    private float minValue;

    public float getMaxValue() {
        return maxValue;
    }

    public float getMinValue() {
        return minValue;
    }

    public void findMaxMin(float[] values) {

        maxValue = values[0];
        minValue = values[0];

        for (int i = 1; i < values.length; i++) {

            if (values[i] > maxValue) {
                maxValue = values[i];
            }

            if (values[i] < minValue) {
                minValue = values[i];
            }
        }
    }
}

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
