import java.util.Scanner;

public class Program1 {

   public static void main(String[] args) {

      // Declare variables
      double num1=0.0, num2=0.0;
      char operator='\0';
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      num1 = sc.nextDouble();
      num2 = sc.nextDouble();

      // read operator
      System.out.println("Total number of Operators"
		+ "are::  (+ - * / % ^)");
      System.out.print("Enter operator: ");
      operator = sc.next().charAt(0);

      // switch-case statements
      switch(operator) {

         case '+':
            System.out.println("Result = "+ (num1+num2));
		break;

	 case '-':
	    System.out.println("Result = "+ (num1-num2));
		break;

	 case '*':
	    System.out.println("Result = "+ (num1*num2));
		break;

	 case '/':
	    System.out.println("Result = "+ (num1/num2));
		break;

	 case '%':
	    System.out.println("Result = "+ (num1%num2));
		break;

	 case '^':
	    System.out.println("Result = "+ 
                               Math.pow(num1,num2));
		break;

	 default:
	    System.out.println("Invalid operator");
      } 
      sc.close();

   } 
}
