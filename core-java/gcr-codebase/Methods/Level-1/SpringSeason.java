import java.util.Scanner;

public class SpringSeason {
    public static boolean isSpring(int month, int day) {
        // Spring is March 20 to June 20 inclusive
        if (month == 3) return day >= 20 && day <= 31;
        if (month == 4 || month == 5) return day >= 1 && day <= 31;
        if (month == 6) return day >= 1 && day <= 20;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();
        boolean spring = isSpring(month, day);
        if (spring) System.out.println("Its a Spring Season");
        else System.out.println("Not a Spring Season");
        sc.close();
    }
}
