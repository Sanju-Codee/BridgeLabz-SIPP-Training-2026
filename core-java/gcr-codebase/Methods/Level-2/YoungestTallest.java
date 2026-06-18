import java.util.Scanner;

public class YoungestTallest {
    public static int indexOfYoungest(int[] ages) {
        int idx = 0;
        for (int i = 1; i < ages.length; i++) if (ages[i] < ages[idx]) idx = i;
        return idx;
    }

    public static int indexOfTallest(double[] heights) {
        int idx = 0;
        for (int i = 1; i < heights.length; i++) if (heights[i] > heights[idx]) idx = i;
        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height (cm) for " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }
        int yIdx = indexOfYoungest(ages);
        int tIdx = indexOfTallest(heights);
        System.out.println("Youngest: " + names[yIdx] + " (age=" + ages[yIdx] + ")");
        System.out.println("Tallest: " + names[tIdx] + " (height=" + heights[tIdx] + " cm)");
        sc.close();
    }
}
