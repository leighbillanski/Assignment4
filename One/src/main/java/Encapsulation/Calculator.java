package Encapsulation;

public class Calculator {

    private int num1;
    private int num2;
    private int sum;

    public Calculator(int a,int b){
        this.num1 = a;
        this.num2 = b;
    }

    public Calculator(){

    }

    public int getSum() {
        return sum;
    }

    public void setSum(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.sum = num1 + num2;
    }
}
