package calculator5;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculator5
{
    public static void main(String[] args) 
    {
       Scanner input=new Scanner(System.in);
		
		double number1,number2,answer = 0.0;
                boolean a = true;
		char operation;
                String ndfsd;
                
                
                System.out.print("Welcome to my calculator! Use + for addition, - for subtraction, * for multiplication, / for division, and ^ for squaring numbers. Press enter to start:");
                ndfsd = input.nextLine();
                
                while (a = true) {

		System.out.print("enter a number: "); 
		number1 = input.nextInt(); 
		System.out.print("enter another number: ");
		number2 = input.nextInt();
		System.out.print("enter an operation: "); 
		operation=input.next().charAt(0);


		if (operation == '+' ) {
			answer = number1 + number2;
			System.out.println(number1 + " " + operation + " " +number2 + " is " + " " + answer );
		}
		else if(operation == '-')
		{
			answer = number1 - number2;
			System.out.println(number1 + " " + operation + " " + number2 + " is " + " " + answer );
		}
		else if(operation == '/'){
				answer = number1 / number2;
				System.out.println(number1 + " " + operation + " " + number2 + " is " + " " + answer );
	    }
		else if(operation == '*'){
					answer = number1 * number2;
					System.out.println(number1 + " " + operation + " "  + number2 + " is " + " " + answer );
		}
                else if(operation == '^') {
                    answer = Math.pow(number1, number2);
                    System.out.println(number1 + " " + operation + " "  + number2 + " is " + " " + answer );
                }
		else
		System.out.println("try again");
		
                }
	}
}