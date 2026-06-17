import java.util.Scanner;

public class MeanHeightTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        System.out.println("Enter heights of 11 players:");
        double sum = 0.0;
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        double mean = sum / heights.length;
        System.out.println("Mean height = " + mean);
        sc.close();
    }
}
