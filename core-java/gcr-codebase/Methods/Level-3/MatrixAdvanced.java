public class MatrixAdvanced {
    public static double[][] transpose(double[][] a){
        int r=a.length,c=a[0].length; double[][] t=new double[c][r];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) t[j][i]=a[i][j];
        return t;
    }

    public static double det2(double[][] m){
        return m[0][0]*m[1][1]-m[0][1]*m[1][0];
    }

    public static double det3(double[][] m){
        double a=m[0][0],b=m[0][1],c=m[0][2];
        double d=m[1][0],e=m[1][1],f=m[1][2];
        double g=m[2][0],h=m[2][1],i=m[2][2];
        return a*(e*i-f*h)-b*(d*i-f*g)+c*(d*h-e*g);
    }

    public static double[][] inverse2(double[][] m){
        double det = det2(m);
        if (det == 0) return null;
        double[][] inv = {{m[1][1]/det, -m[0][1]/det},{-m[1][0]/det, m[0][0]/det}};
        return inv;
    }

    public static double[][] inverse3(double[][] m){
        double det = det3(m);
        if (Math.abs(det) < 1e-9) return null;
        double[][] cof = new double[3][3];
        for(int r=0;r<3;r++) for(int c=0;c<3;c++){
            double[][] sub = new double[2][2]; int si=0;
            for(int i=0;i<3;i++) if(i!=r){ int sj=0; for(int j=0;j<3;j++) if(j!=c){ sub[si][sj++]=m[i][j]; } si++; }
            double d = det2(sub);
            cof[r][c] = ((r+c)%2==0)?d:-d;
        }
        double[][] adj = transpose(cof);
        double[][] inv = new double[3][3];
        for(int r=0;r<3;r++) for(int c=0;c<3;c++) inv[r][c]=adj[r][c]/det;
        return inv;
    }

    public static void print(double[][] m){
        for(double[] row:m){ for(double v:row) System.out.printf("%10.4f",v); System.out.println(); }
    }

    public static void main(String[] args){
        double[][] m2={{4,7},{2,6}};
        System.out.println("Det2: " + det2(m2));
        System.out.println("Inv2:"); print(inverse2(m2));
        double[][] m3={{1,2,3},{0,1,4},{5,6,0}};
        System.out.println("Det3: " + det3(m3));
        System.out.println("Inv3:"); print(inverse3(m3));
    }
}
