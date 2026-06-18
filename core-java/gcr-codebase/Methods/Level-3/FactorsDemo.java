import java.util.Arrays;

public class FactorsDemo {
    public static int[] factors(int n){
        if (n==0) return new int[0];
        int up=Math.abs(n); int[] tmp=new int[up]; int cnt=0;
        for(int i=1;i<=up;i++) if(n%i==0) tmp[cnt++]=i;
        return Arrays.copyOf(tmp,cnt);
    }

    public static int greatest(int n){
        int[] f=factors(n); int g=0; for(int v:f) if(v!=n && v>g) g=v; return g;
    }

    public static int sum(int n){ int s=0; for(int v:factors(n)) s+=v; return s; }
    public static long product(int n){ long p=1; for(int v:factors(n)) p*=v; return p; }
    public static double productCube(int n){ double p=1; for(int v:factors(n)) p*=Math.pow(v,3); return p; }

    public static void main(String[] args){
        int n=12;
        System.out.println("Factors of " + n + ": " + Arrays.toString(factors(n)));
        System.out.println("Greatest proper factor: " + greatest(n));
        System.out.println("Sum: " + sum(n));
        System.out.println("Product: " + product(n));
        System.out.println("Product of cubes: " + productCube(n));
    }
}
