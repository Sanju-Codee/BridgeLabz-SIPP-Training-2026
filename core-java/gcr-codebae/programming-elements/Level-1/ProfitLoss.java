public class ProfitLoss {
    public static void main(String [] args){
        int cp=129;
        int sp=191;
        if(sp>cp){
            int profit=sp-cp;
            float profitpercent=(float)profit/cp*100;
            System.out.println("The Cost Price is INR " + cp + " and Selling Price is INR " + sp + "\nThe Profit is INR " +profit + " and the Profit Percentage is " + profitpercent);
        }
        if(cp>sp){
            int loss=cp-sp;
            float losspercent=(float)loss/cp*100;
            System.out.println("The Cost Price is INR " + cp + " and Selling Price is INR " + sp + "\nThe Loss is INR " + loss + " and the Loss Percentage is " + losspercent);
        }
    }
}
