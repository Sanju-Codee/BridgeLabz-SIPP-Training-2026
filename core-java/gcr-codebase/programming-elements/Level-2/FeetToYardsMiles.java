import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double feet = input.nextDouble();
        double yards = feet / 3.0; // 1 yard = 3 feet
        double miles = yards / 1760.0; // 1 mile = 1760 yards
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.6f%n", yards, miles);
        input.close();
    }
}
