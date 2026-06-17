import java.security.InvalidAlgorithmParameterException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidateAge {
    public static void validateAge(int age) throws InvalidAlgorithmParameterException {
        if (age < 18) throw new InvalidAlgorithmParameterException("Age must be 18 or above");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            try {
                validateAge(age);
                System.out.println("Access granted!");
            } catch (InvalidAlgorithmParameterException e) {
                System.out.println(e.getMessage());
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: please enter an integer age");
        } finally {
            sc.close();
        }
    }
}
