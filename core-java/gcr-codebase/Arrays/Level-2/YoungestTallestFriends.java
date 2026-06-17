import java.util.Scanner;

public class YoungestTallestFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter age of %s: ", names[i]);
            ages[i] = sc.nextInt();
            System.out.printf("Enter height (m) of %s: ", names[i]);
            heights[i] = sc.nextDouble();
            if (ages[i] < 0 || heights[i] <= 0) {
                System.out.println("Invalid input. Age must be >=0 and height > 0. Enter again.");
                i--;
            }
        }

        int minIdx = 0;
        int maxIdx = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minIdx]) minIdx = i;
            if (heights[i] > heights[maxIdx]) maxIdx = i;
        }

        System.out.printf("Youngest: %s (age %d)\n", names[minIdx], ages[minIdx]);
        System.out.printf("Tallest: %s (height %.2f m)\n", names[maxIdx], heights[maxIdx]);
        sc.close();
    }
}
