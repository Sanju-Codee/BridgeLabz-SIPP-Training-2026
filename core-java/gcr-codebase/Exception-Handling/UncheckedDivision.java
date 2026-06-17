import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            double a = sc.nextDouble();
            System.out.print("Enter denominator: ");
            double b = sc.nextDouble();
            double res = a / b;
            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: please enter numeric values");
        } finally {
            sc.close();
        }
    }
}
