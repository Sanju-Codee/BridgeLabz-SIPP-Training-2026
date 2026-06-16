import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        double p = sc.nextDouble();
        System.out.print("Enter marks in Chemistry: ");
        double c = sc.nextDouble();
        System.out.print("Enter marks in Maths: ");
        double m = sc.nextDouble();

        double total = p + c + m;
        double average = total / 3.0;
        double percent = (total / 300.0) * 100.0;

        String grade;
        String remarks;
        if (percent >= 90) { grade = "A"; remarks = "Excellent"; }
        else if (percent >= 80) { grade = "B"; remarks = "Very Good"; }
        else if (percent >= 70) { grade = "C"; remarks = "Good"; }
        else if (percent >= 60) { grade = "D"; remarks = "Fair"; }
        else { grade = "F"; remarks = "Needs Improvement"; }

        System.out.printf("Average marks: %.2f\n", average);
        System.out.printf("Percentage: %.2f%%\n", percent);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        sc.close();
    }
}
