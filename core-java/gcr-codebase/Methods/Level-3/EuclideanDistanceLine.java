public class EuclideanDistanceLine {
    public static double distance(double x1,double y1,double x2,double y2){
        return Math.hypot(x2-x1, y2-y1);
    }

    public static double[] lineEquation(double x1,double y1,double x2,double y2){
        if (x1 == x2) return new double[]{Double.POSITIVE_INFINITY, Double.NaN};
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        double x1=1,y1=2,x2=4,y2=6;
        System.out.printf("Distance: %.4f\n", distance(x1,y1,x2,y2));
        double[] eq = lineEquation(x1,y1,x2,y2);
        if (Double.isInfinite(eq[0])) System.out.println("Vertical line at x="+x1);
        else System.out.printf("Line: y = %.4fx + %.4f\n", eq[0], eq[1]);
    }
}
