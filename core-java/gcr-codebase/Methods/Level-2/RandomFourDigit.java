import java.util.Random;

public class RandomFourDigit {
    public static int[] generate4DigitRandomArray(int size) {
        Random r = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = 1000 + r.nextInt(9000);
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        if (numbers.length == 0) return new double[0];
        int min = numbers[0], max = numbers[0];
        long sum = 0;
        for (int v : numbers) {
            sum += v;
            if (v < min) min = v;
            if (v > max) max = v;
        }
        double avg = (double) sum / numbers.length;
        return new double[]{ avg, min, max };
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        System.out.print("Generated: ");
        for (int v : arr) System.out.print(v + " ");
        System.out.println();
        double[] stats = findAverageMinMax(arr);
        System.out.println("Average: " + stats[0] + ", Min: " + stats[1] + ", Max: " + stats[2]);
    }
}
