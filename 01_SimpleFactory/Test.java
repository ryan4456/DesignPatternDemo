import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input number 1：");
            int numberA = scanner.nextInt();
            System.out.print("Input operator（+ - * /）：");
            String operate = scanner.next();
            System.out.print("Input number 2：");
            int numberB = scanner.nextInt();
            Operation operation = OperationFactory.getOperation(operate);
            operation.setNumberA(numberA);
            operation.setNumberB(numberB);
            double result = operation.getResult();
            System.out.println("Result：" + result);
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}