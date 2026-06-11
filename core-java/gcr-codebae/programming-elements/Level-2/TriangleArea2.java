import java.util.Scanner;

public class TriangleArea2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double baseCm = input.nextDouble();
        double heightCm = input.nextDouble();
        double areaCm2 = 0.5 * baseCm * heightCm;
        double areaIn2 = areaCm2 / (2.54 * 2.54);
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n", areaIn2, areaCm2);
        input.close();
    }
}
