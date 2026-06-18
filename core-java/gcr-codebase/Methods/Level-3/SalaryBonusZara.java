import java.util.Random;

public class SalaryBonusZara {
    public static Object[][] generateEmployees(int n) {
        Object[][] arr = new Object[n][2];
        Random r = new Random(12345);
        for (int i = 0; i < n; i++) {
            int salary = 10000 + r.nextInt(90000);
            int years = r.nextInt(11);
            arr[i][0] = salary;
            arr[i][1] = years;
        }
        return arr;
    }

    public static Object[][] applyBonus(Object[][] emp) {
        Object[][] out = new Object[emp.length][3];
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        for (int i = 0; i < emp.length; i++) {
            int salary = (int) emp[i][0];
            int years = (int) emp[i][1];
            double pct = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * pct;
            double newSalary = salary + bonus;
            out[i][0] = salary; out[i][1] = years; out[i][2] = bonus;
            totalOld += salary; totalNew += newSalary; totalBonus += bonus;
        }
        return out;
    }

    public static void display(Object[][] emp, Object[][] withBonus) {
        System.out.println("Idx\tOldSalary\tYears\tBonus");
        double sumOld=0,sumNew=0,sumBonus=0;
        for (int i = 0; i < emp.length; i++) {
            int old = (int) emp[i][0];
            int years = (int) emp[i][1];
            double bonus = (double) withBonus[i][2];
            double nw = old + bonus;
            sumOld += old; sumNew += nw; sumBonus += bonus;
            System.out.printf("%d\t%d\t%d\t%.2f\n", i+1, old, years, bonus);
        }
        System.out.printf("Totals:\t%.0f\t - \t%.2f\n", sumOld, sumBonus);
        System.out.printf("New Salaries Sum: %.2f\n", sumNew);
    }

    public static void main(String[] args) {
        Object[][] emp = generateEmployees(10);
        Object[][] withBonus = applyBonus(emp);
        display(emp, withBonus);
    }
}
