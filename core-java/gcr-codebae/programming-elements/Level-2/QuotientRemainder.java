import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int quotient = number2 != 0 ? number1 / number2 : 0;
        int remainder = number2 != 0 ? number1 % number2 : number1;
        System.out.printf("The Quotient is %d and Reminder is %d of two number %d and %d%n", quotient, remainder, number1, number2);
        input.close();
    }
}
