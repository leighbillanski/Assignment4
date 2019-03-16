package Encapsulation;

public class RunCalculator {

    public static void main(String[] args){

       // Calculator calculator = new Calculator();
        //calculator.num1;  //To show num1 in Calculator cannot be accessed for the RunCalculator class.

        int num1 = 5;
        int num2 = 3;
        Calculator calculator1 = new Calculator(num1,num2);
        calculator1.setSum(num1,num2);
        int sum = calculator1.getSum();
        System.out.println(num1 + "+" + num2 + "=" + sum);

    }

}
