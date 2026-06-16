import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (>0): ");
        if (!sc.hasNextInt()) { System.out.println("Invalid input"); sc.close(); return; }
        int number = sc.nextInt();
        if (number <= 0) { System.out.println("Enter a positive integer"); sc.close(); return; }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        if (sum > number) System.out.println(number + " is an Abundant Number");
        else System.out.println(number + " is NOT an Abundant Number");
        sc.close();
    }
}
