public class CashContext {
    CashSuper cashSuper;

    public CashContext(String type){
        this.cashSuper = CashFactory.createCashAccept(type);
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
