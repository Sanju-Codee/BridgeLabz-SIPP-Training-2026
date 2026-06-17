import java.util.Random;
import java.util.Scanner;

public class StudentMarksScorecard {
    public static int[][] generateRandomPCM(int students) {
        Random r = new Random();
        int[][] res = new int[students][3];
        for (int i = 0; i < students; i++) {
            res[i][0] = 10 + r.nextInt(90); // Physics
            res[i][1] = 10 + r.nextInt(90); // Chemistry
            res[i][2] = 10 + r.nextInt(90); // Maths
        }
        return res;
    }

    public static double[][] totalsAveragesPercentages(int[][] scores) {
        int n = scores.length;
        double[][] out = new double[n][3]; // total, average, percentage
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double pct = (total / 300.0) * 100.0;
            out[i][0] = Math.round(total * 100.0) / 100.0;
            out[i][1] = Math.round(avg * 100.0) / 100.0;
            out[i][2] = Math.round(pct * 100.0) / 100.0;
        }
        return out;
    }

    public static String[] gradesFromPercentage(double[] percents) {
        String[] grades = new String[percents.length];
        for (int i = 0; i < percents.length; i++) {
            double p = percents[i];
            if (p >= 90) grades[i] = "A";
            else if (p >= 80) grades[i] = "B";
            else if (p >= 70) grades[i] = "C";
            else if (p >= 60) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPct\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\t%s\n",
                i+1, scores[i][0], scores[i][1], scores[i][2], stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = sc.nextInt();
        int[][] scores = generateRandomPCM(n);
        double[][] stats = totalsAveragesPercentages(scores);
        double[] percents = new double[n];
        for (int i = 0; i < n; i++) percents[i] = stats[i][2];
        String[] grades = gradesFromPercentage(percents);
        displayScorecard(scores, stats, grades);
        sc.close();
    }
}
