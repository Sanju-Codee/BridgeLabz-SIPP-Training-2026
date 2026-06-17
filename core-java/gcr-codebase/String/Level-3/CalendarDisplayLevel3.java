import java.util.Scanner;

public class CalendarDisplayLevel3 {
    private static String monthName(int m) {
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        return months[m-1];
    }

    private static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    private static int daysInMonth(int m, int y) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (m == 2 && isLeap(y)) return 29;
        return days[m-1];
    }

    // returns day of week for d=1..7 where 0=Sunday
    private static int firstDay(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0; // 0=Sunday
    }

    public static void displayCalendar(int month, int year) {
        System.out.printf("    %s %d\n", monthName(month), year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int first = firstDay(month, year);
        int days = daysInMonth(month, year);
        int i;
        for (i = 0; i < first; i++) System.out.print("    ");
        for (int d = 1; d <= days; d++) {
            System.out.printf("%3d ", d);
            if ((i + d) % 7 == 0) System.out.println();
            if ((i + d) % 7 != 0 && d == days) System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();
        displayCalendar(m, y);
        sc.close();
    }
}
