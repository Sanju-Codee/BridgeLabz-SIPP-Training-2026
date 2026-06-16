import java.util.Scanner;

public class SumNaturalFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        if (n >= 1) {
            long formula = n * (n + 1) / 2;
            System.out.printf("The sum of %d natural numbers is %d%n", n, formula);
        } else {
            System.out.printf("The number %d is not a natural number%n", n);
        }
        input.close();
    }
}
