import java.util.Scanner;

public class BMICalculator {
    // array rows=10, cols: 0=weight(kg),1=height(cm),2=bmi
    public static void computeBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = 0;
            if (heightM > 0) bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }

    public static String getStatus(double bmi) {
        if (bmi <= 0) return "Invalid";
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height(cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        computeBMI(data);
        System.out.println("weight(kg)\theight(cm)\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", data[i][0], data[i][1], data[i][2], getStatus(data[i][2]));
        }
        sc.close();
    }
}
