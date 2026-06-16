import java.util.Scanner;

public class LeapYearIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year (>=1582): ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        int year = sc.nextInt();
        if (year < 1582) {
            System.out.println("Year must be >= 1582 for Gregorian calendar");
            sc.close();
            return;
        }

        // Multiple if-else approach
        if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year (divisible by 400)");
        } else if (year % 100 == 0) {
            System.out.println(year + " is NOT a Leap Year (century not divisible by 400)");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year (divisible by 4 and not a century)");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }

        sc.close();
    }
}
