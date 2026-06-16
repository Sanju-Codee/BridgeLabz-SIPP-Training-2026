import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number > 0) {
            System.out.printf("The number %d is positive.%n", number);
        } else if (number < 0) {
            System.out.printf("The number %d is negative.%n", number);
        } else {
            System.out.printf("The number %d is zero.%n", number);
        }
        input.close();
    }
}
