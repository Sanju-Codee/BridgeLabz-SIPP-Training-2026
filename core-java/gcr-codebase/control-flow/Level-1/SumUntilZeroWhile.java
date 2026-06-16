import java.util.Scanner;

public class SumUntilZeroWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double val = input.nextDouble();
        while (val != 0.0) {
            total += val;
            val = input.nextDouble();
        }
        System.out.printf("Total is %.2f%n", total);
        input.close();
    }
}
