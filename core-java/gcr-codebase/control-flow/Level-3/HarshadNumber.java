import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (!sc.hasNextInt()) { System.out.println("Invalid input"); sc.close(); return; }
        int number = sc.nextInt();
        int original = Math.abs(number);
        int sum = 0;
        while (original != 0) {
            sum += original % 10;
            original /= 10;
        }
        if (sum != 0 && number % sum == 0) System.out.println(number + " is a Harshad Number");
        else System.out.println(number + " is NOT a Harshad Number");
        sc.close();
    }
}
