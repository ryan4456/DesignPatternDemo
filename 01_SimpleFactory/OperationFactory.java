public class OperationFactory {
    public static Operation getOperation(String operate){
        switch (operate) {
            case "+":
                return new OperationAdd();
            case "-":
                return new OperationMinus();
            case "*":
                return new OperationMultiply();
            case "/":
                return new OperationDivide();
            default:
                return null;
        }
    }
}