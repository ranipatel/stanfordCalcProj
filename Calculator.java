package calculator;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
    {
        float number1, number2, number3;
        char operation;
        double answer = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        number1 = input.nextFloat();
        System.out.println("Enter another number:");
        number2 = input.nextFloat();
        System.out.println("Enter an operation:");
        operation = input.next().charAt(0);
        
        switch (operation) {
            case '+' : answer = number1 + number2;
            break;
            case '-' : answer = number1 - number2;
                    break;
            case '*' : answer = number1 * number2;
                    break;
            case '/' : answer = number1 / number2;
            break;
            
           
        }
         System.out.println(number1 + " " + operation + " " + number2 + " is " + answer);
                      
    }
}
}