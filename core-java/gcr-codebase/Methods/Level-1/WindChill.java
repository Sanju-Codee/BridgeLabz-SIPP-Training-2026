import java.util.Scanner;

public class WindChill {
    public static double calculateWindChill(double temperatureF, double windSpeedMph) {
        // Use the standard wind chill formula (valid for T <= 50 F and V > 3 mph)
        double vPow = Math.pow(windSpeedMph, 0.16);
        return 35.74 + 0.6215 * temperatureF - 35.75 * vPow + 0.4275 * temperatureF * vPow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature (F): ");
        double t = sc.nextDouble();
        System.out.print("Enter wind speed (mph): ");
        double v = sc.nextDouble();
        double wc = calculateWindChill(t, v);
        System.out.println("Wind chill temperature: " + wc);
        sc.close();
    }
}
