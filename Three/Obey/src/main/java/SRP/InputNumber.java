package SRP;

import java.util.Scanner;

public class InputNumber {


    public Calculator calculator = new Calculator();

    public void inputNumber(){
        Scanner scanner = new Scanner(System.in);
        int input,input1;

        System.out.print("Enter number : ");
        input = scanner.nextInt();
        System.out.print("Enter another number : ");
        input1 = scanner.nextInt();

        calculator.calcSum(input,input1);

       // System.out.println("Answer: " + calculator.getSum());
    }

}
