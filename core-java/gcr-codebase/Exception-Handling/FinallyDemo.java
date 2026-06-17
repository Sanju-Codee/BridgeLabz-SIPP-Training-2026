import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter integer a: ");
            int a = sc.nextInt();
            System.out.print("Enter integer b: ");
            int b = sc.nextInt();
            int r = a / b;
            System.out.println("Result: " + r);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } finally {
            System.out.println("Operation completed");
            sc.close();
        }
    }
}
