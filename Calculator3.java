 import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculator3
{
    public static void main(String[] args) 
    {
       Scanner input=new Scanner(System.in);
		
		double number1,number2,answer = 0.0;
                boolean a = true;
		char operation, quit;
                
		System.out.print("enter a number: "); 
		number1 = input.nextInt(); 
		System.out.print("enter another number: ");
		number2 = input.nextInt();
		System.out.print("enter an operation: "); 
		operation=input.next().charAt(0);
                
                while (a = true) {
                    
                System.out.print("do you want to quit?: ");
                quit = input.next().charAt(0);
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
                else if(quit == 'y') {
                    break;
                }
                else if(quit == 'n') {
                    
                }
		else
		System.out.println("try again");
		
                }
	}

}