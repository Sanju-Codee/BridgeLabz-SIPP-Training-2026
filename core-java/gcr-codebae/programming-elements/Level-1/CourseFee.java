public class CourseFee {
    public static void main(String[] args) {
        int Coursefee=1250000;
        int Discountpercent=10;
        int Discountprice=Coursefee*Discountpercent/100;
        int Finalfee=Coursefee-Discountprice;
        System.out.println("Disocunted Price: " + Discountprice);
        System.out.println("Final Course fee: " + Finalfee);
    }
}
