import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base (in inches): ");
        double base = input.nextDouble();
        System.out.print("Enter height (in inches): ");
        double height = input.nextDouble();
        double areaInSqIn = 0.5 * base * height;
        double areaInSqCm = areaInSqIn * Math.pow(2.54, 2);
        System.out.println("The area of the triangle is " + areaInSqIn + " square inches and " + areaInSqCm + " square centimeters");
        input.close();
    }
}
