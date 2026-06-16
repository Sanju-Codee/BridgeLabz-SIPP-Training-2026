import java.util.Scanner;

public class SumNUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 1) {
            System.out.printf("The number %d is not a natural number%n", n);
            input.close();
            return;
        }
        long formula = (long) n * (n + 1) / 2;
        long sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.printf("Formula result: %d, While-loop result: %d, Match: %b%n", formula, sum, formula == sum);
        input.close();
    }
}
