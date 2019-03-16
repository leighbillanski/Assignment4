package SRP;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int input1,input2,output;
        System.out.print("Enter number : ");
        input1 = scanner.nextInt();
        System.out.print("Enter another number : ");
        input2 = scanner.nextInt();

        output = input1 + input2;
        System.out.println("Answer : " + output);
    }

}
