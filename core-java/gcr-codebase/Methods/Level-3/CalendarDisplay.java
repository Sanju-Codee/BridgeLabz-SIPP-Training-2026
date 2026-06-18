public class CalendarDisplay {
    private static final String[] MONTHS = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    private static final int[] DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};

    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static int firstDayOfMonth(int month, int year) {
        int m = month + 1;
        int Y = year;
        if (m < 3) { m += 12; Y -= 1; }
        int K = Y % 100;
        int J = Y / 100;
        int q = 1;
        int h = (q + (13*(m+1))/5 + K + (K/4) + (J/4) + 5*J) % 7;
        int d = ((h + 6) % 7);
        return d;
    }

    public static void printCalendar(int monthZeroBased, int year) {
        int month = monthZeroBased; // 0..11
        String name = MONTHS[month];
        int days = DAYS[month];
        if (month == 1 && isLeap(year)) days = 29;
        System.out.printf("    %s %d\n", name, year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        int first = firstDayOfMonth(month+1, year);
        for (int i = 0; i < first; i++) System.out.print("   ");
        for (int d = 1; d <= days; d++) {
            System.out.printf("%2d ", d);
            if ((first + d) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printCalendar(6, 2005);
    }
}
