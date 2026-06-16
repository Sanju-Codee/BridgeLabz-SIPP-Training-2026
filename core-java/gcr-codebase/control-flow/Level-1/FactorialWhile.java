import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 0) {
            System.out.println("Please enter a non-negative integer");
            input.close();
            return;
        }
        long result = 1;
        int i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        System.out.printf("Factorial of %d is %d%n", n, result);
        input.close();
    }
}
