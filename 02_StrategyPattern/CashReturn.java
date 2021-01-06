public class CashReturn extends CashSuper {

    private double moneyCondition = 0d;
    private double moneyReturn = 0.0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.setMoneyCondition(moneyCondition);
        this.setMoneyReturn(moneyReturn);
    }

    public double getMoneyReturn() {
        return moneyReturn;
    }

    public void setMoneyReturn(double moneyReturn) {
        this.moneyReturn = moneyReturn;
    }

    public double getMoneyCondition() {
        return moneyCondition;
    }

    public void setMoneyCondition(double moneyCondition) {
        this.moneyCondition = moneyCondition;
    }

    @Override
    public double acceptCash(double money) {
        if(money >= moneyCondition){
            return money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return money;
    }
    
}
