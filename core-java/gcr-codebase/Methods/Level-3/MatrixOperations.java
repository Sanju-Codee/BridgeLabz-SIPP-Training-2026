import java.util.Random;

public class MatrixOperations {
    public static int[][] randomMatrix(int r,int c){
        Random R = new Random(7);
        int[][] m = new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) m[i][j]=R.nextInt(10);
        return m;
    }

    public static int[][] add(int[][] a,int[][] b){
        int r=a.length, c=a[0].length; int[][] out=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) out[i][j]=a[i][j]+b[i][j];
        return out;
    }

    public static int[][] subtract(int[][] a,int[][] b){
        int r=a.length, c=a[0].length; int[][] out=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) out[i][j]=a[i][j]-b[i][j];
        return out;
    }

    public static int[][] multiply(int[][] a,int[][] b){
        int r=a.length, m=b.length, c=b[0].length; int[][] out=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++){
            int s=0; for(int k=0;k<m;k++) s+=a[i][k]*b[k][j]; out[i][j]=s;
        }
        return out;
    }

    public static void print(int[][] a){
        for(int[] row:a){ for(int v:row) System.out.printf("%4d",v); System.out.println(); }
    }

    public static void main(String[] args){
        int[][] A = randomMatrix(2,3);
        int[][] B = randomMatrix(3,2);
        System.out.println("A:"); print(A);
        System.out.println("B:"); print(B);
        int[][] C = randomMatrix(2,3);
        System.out.println("C:"); print(C);
        System.out.println("A + C:"); print(add(A,C));
        System.out.println("A - C:"); print(subtract(A,C));
        System.out.println("A * B:"); print(multiply(A,B));
    }
}
