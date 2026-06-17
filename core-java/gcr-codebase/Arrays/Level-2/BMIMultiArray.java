import java.util.Scanner;

public class BMIMultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[][] personData = new double[n][3]; // [weight, height, bmi]
        String[] weightStatus = new String[n];

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
            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = w / (h * h);
            weightStatus[i] = bmiStatus(personData[i][2]);
        }

        System.out.println("\nPerson  Height(m)  Weight(kg)  BMI    Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d       %.2f      %.2f      %.2f  %s\n", i + 1, personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
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
