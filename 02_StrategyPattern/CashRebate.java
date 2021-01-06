public class CashRebate extends CashSuper{

    private double rebate = 1d;

    public CashRebate(String rebateStr){
        this.rebate = Double.parseDouble(rebateStr);
    }

    @Override
    public double acceptCash(double money) {
        return money * rebate;
    }

    public double getRebate() {
        return rebate;
    }
    
    public void setRebate(double rebate) {
        this.rebate = rebate;
    }
}
