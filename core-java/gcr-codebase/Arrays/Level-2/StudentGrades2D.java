import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        double[][] marks = new double[n][3]; // physics, chemistry, maths
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d Physics: ", i + 1);
            double p = sc.nextDouble();
            System.out.printf("Student %d Chemistry: ", i + 1);
            double c = sc.nextDouble();
            System.out.printf("Student %d Maths: ", i + 1);
            double m = sc.nextDouble();
            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Invalid negative marks. Enter again.");
                i--;
                continue;
            }
            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
            percent[i] = (p + c + m) / 3.0;
            grade[i] = computeGrade(percent[i]);
        }

        System.out.println("\nStudent  Physics  Chemistry  Maths  Percentage  Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d        %.1f     %.1f       %.1f    %.2f%%      %s\n", i + 1, marks[i][0], marks[i][1], marks[i][2], percent[i], grade[i]);
        }
        sc.close();
    }

    private static String computeGrade(double p) {
        if (p >= 90) return "A";
        if (p >= 80) return "B";
        if (p >= 70) return "C";
        if (p >= 60) return "D";
        return "F";
    }
}
