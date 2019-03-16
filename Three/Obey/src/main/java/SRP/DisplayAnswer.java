package SRP;

public class DisplayAnswer {



    public static void main(String[] args){

        InputNumber inputNumber = new InputNumber();
        //Calculator calculator = new Calculator();

        inputNumber.inputNumber();
        int sum = inputNumber.calculator.getSum();

        System.out.println("Answer : " + sum);
    }

}
