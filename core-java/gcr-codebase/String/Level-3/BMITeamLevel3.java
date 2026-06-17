import java.util.Scanner;

public class BMITeamLevel3 {
    // data[i][0] = weight(kg), data[i][1] = height(cm)
    public static String[][] computeBMI(String[][] dataStr) {
        int n = dataStr.length;
        String[][] out = new String[n][4]; // height, weight, bmi, status
        for (int i = 0; i < n; i++) {
            double w = Double.parseDouble(dataStr[i][0]);
            double hcm = Double.parseDouble(dataStr[i][1]);
            double hm = hcm / 100.0;
            double bmi = (hm > 0) ? w / (hm * hm) : 0.0;
            String status = bmiStatus(bmi);
            out[i][0] = String.format("%.2f", hcm);
            out[i][1] = String.format("%.2f", w);
            out[i][2] = String.format("%.2f", bmi);
            out[i][3] = status;
        }
        return out;
    }

    private static String bmiStatus(double b) {
        if (b < 18.5) return "Underweight";
        if (b < 25) return "Normal";
        if (b < 30) return "Overweight";
        return "Obese";
    }

    public static void displayTable(String[][] table) {
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\tStatus");
        for (int i = 0; i < table.length; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%s\t%s\n", i + 1, table[i][0], table[i][1], table[i][2], table[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 10;
        String[][] dataStr = new String[N][2];
        System.out.println("Enter weight(kg) and height(cm) for 10 persons:");
        for (int i = 0; i < N; i++) {
            System.out.printf("Person %d weight (kg): ", i + 1);
            double w = sc.nextDouble();
            System.out.printf("Person %d height (cm): ", i + 1);
            double h = sc.nextDouble();
            if (w <= 0 || h <= 0) { System.out.println("Invalid input, enter positive values."); i--; continue; }
            dataStr[i][0] = String.valueOf(w);
            dataStr[i][1] = String.valueOf(h);
        }
        String[][] result = computeBMI(dataStr);
        displayTable(result);
        sc.close();
    }
}
