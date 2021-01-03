import java.util.Scanner; 

public abstract class Operation{
    private double numberA;
    private double numberB;

    public abstract double getResult();

    public double getNumberA(){
        return numberA;
    }

    public double getNumberB(){
        return numberB;
    }

    public void setNumberA(double numberA){
        this.numberA = numberA;
    }

    public void setNumberB(double numberB){
        this.numberB = numberB;
    }

}