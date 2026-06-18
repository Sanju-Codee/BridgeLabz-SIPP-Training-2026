import java.util.Scanner;

public class TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angleDegrees) {
        double rad = Math.toRadians(angleDegrees);
        double sin = Math.sin(rad);
        double cos = Math.cos(rad);
        double tan = Math.tan(rad);
        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        double[] res = calculateTrigonometricFunctions(angle);
        System.out.println("sin(" + angle + ") = " + res[0]);
        System.out.println("cos(" + angle + ") = " + res[1]);
        System.out.println("tan(" + angle + ") = " + res[2]);
        sc.close();
    }
}
