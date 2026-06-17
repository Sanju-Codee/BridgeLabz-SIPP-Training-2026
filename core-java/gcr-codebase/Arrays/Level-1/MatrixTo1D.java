import java.util.Scanner;

public class MatrixTo1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print("Element[" + r + "][" + c + "]: ");
                matrix[r][c] = sc.nextInt();
            }
        }

        int[] array = new int[rows * cols];
        int idx = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                array[idx++] = matrix[r][c];
            }
        }

        System.out.println("1D array contents:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i + 1 < array.length ? " " : "\n"));
        }
        sc.close();
    }
}
