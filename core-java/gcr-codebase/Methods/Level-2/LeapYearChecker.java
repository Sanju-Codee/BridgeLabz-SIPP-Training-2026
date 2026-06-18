import java.util.Scanner;

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int y = sc.nextInt();
        boolean leap = isLeapYear(y);
        if (leap) System.out.println(y + " is a Leap Year");
        else System.out.println(y + " is not a Leap Year");
        sc.close();
    }
}
