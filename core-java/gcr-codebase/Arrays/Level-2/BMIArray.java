import java.util.Scanner;

public class BMIArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d weight (kg): ", i + 1);
            double w = sc.nextDouble();
            System.out.printf("Person %d height (m): ", i + 1);
            double h = sc.nextDouble();
            if (w <= 0 || h <= 0) {
                System.out.println("Invalid input. Enter positive values.");
                i--;
                continue;
            }
            weight[i] = w;
            height[i] = h;
            bmi[i] = w / (h * h);
            status[i] = bmiStatus(bmi[i]);
        }

        System.out.println("\nPerson  Height(m)  Weight(kg)  BMI    Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d       %.2f      %.2f      %.2f  %s\n", i + 1, height[i], weight[i], bmi[i], status[i]);
        }
        sc.close();
    }

    private static String bmiStatus(double b) {
        if (b < 18.5) return "Underweight";
        if (b < 25) return "Normal";
        if (b < 30) return "Overweight";
        return "Obese";
    }
}
