import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program01 {
    public static void main(String[] args) throws IOException{
        System.out.println("请输入数字A：");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        System.out.println("请选择运算符号(+ - * /)：");
        String B = br.readLine();
        System.out.println("请输入数字C：");
        String C = br.readLine();

        String result = "";
        switch (B) {
            case "+":
                result = String.valueOf(Integer.parseInt(A) + Integer.parseInt(C));
                break;
            case "-":
                result = String.valueOf(Integer.parseInt(A) - Integer.parseInt(C));
                break;
            case "*":
                result = String.valueOf(Integer.parseInt(A) * Integer.parseInt(C));
                break;
            case "/":
                result = String.valueOf(Integer.parseInt(A) / Integer.parseInt(C));
                break;
            default:
                break;
        }
        System.out.println("结果是：" + result);
    }
}