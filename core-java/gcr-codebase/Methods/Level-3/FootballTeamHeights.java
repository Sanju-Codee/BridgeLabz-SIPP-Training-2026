import java.util.Arrays;

public class FootballTeamHeights {
    public static int[] generateHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }
        return heights;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int v : arr) s += v;
        return s;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int shortest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int v : arr) if (v < min) min = v;
        return min;
    }

    public static int tallest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int v : arr) if (v > max) max = v;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();
        System.out.println("Heights (cm): " + Arrays.toString(heights));
        System.out.println("Sum: " + sum(heights));
        System.out.printf("Mean: %.2f cm%n", mean(heights));
        System.out.println("Shortest: " + shortest(heights) + " cm");
        System.out.println("Tallest: " + tallest(heights) + " cm");
    }
}
