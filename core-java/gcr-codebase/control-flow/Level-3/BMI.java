import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();
        double heightM = heightCm / 100.0;
        if (heightM <= 0) { System.out.println("Invalid height"); sc.close(); return; }
        double bmi = weight / (heightM * heightM);
        System.out.printf("BMI: %.2f\n", bmi);
        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal weight";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";
        System.out.println("Status: " + status);
        sc.close();
    }
}
