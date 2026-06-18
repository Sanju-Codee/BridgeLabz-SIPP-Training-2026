import java.util.Random;

public class StudentScoreCard {
    public static int[][] generateScores(int students) {
        Random r = new Random(42);
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = 10 + r.nextInt(90);
            scores[i][1] = 10 + r.nextInt(90);
            scores[i][2] = 10 + r.nextInt(90);
        }
        return scores;
    }

    public static double[][] computeTotals(int[][] scores) {
        int n = scores.length;
        double[][] out = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = (double) total / 3.0;
            double perc = (total / 300.0) * 100.0;
            out[i][0] = total; out[i][1] = Math.round(avg * 100.0)/100.0; out[i][2] = Math.round(perc*100.0)/100.0;
        }
        return out;
    }

    public static void display(int[][] scores, double[][] computed) {
        System.out.println("Idx\tP\tC\tM\tTotal\tAvg\t%");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\n", i+1, scores[i][0], scores[i][1], scores[i][2], computed[i][0], computed[i][1], computed[i][2]);
        }
    }

    public static void main(String[] args) {
        int[][] sc = generateScores(5);
        double[][] comp = computeTotals(sc);
        display(sc, comp);
    }
}
