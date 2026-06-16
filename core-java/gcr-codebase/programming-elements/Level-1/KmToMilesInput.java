import java.util.Scanner;

public class KmToMilesInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km = input.nextDouble();
        double miles = km / 1.6; // 1 mile = 1.6 km
        System.out.printf("The total miles is %.2f mile for the given %.2f km%n", miles, km);
        input.close();
    }
}
