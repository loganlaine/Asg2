/**
* Developer - Logan Laine Class - CMIS 141/6382 Date 20AUG2022	Instructor - Professor Rowson
* Program created to calculate the math of any number between 200 and 1000 using the following
* operators, +, -, *, and /
*/
import java.util.Scanner; 

public class Asg2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter two integer numbers between 200 and 1000"); //Data input by user.
	    	System.out.print("seporated by a space: "); //split into two lines for readability. 
	   	int firstValue = scan.nextInt(); //scan first number input.
	   	int secondValue = scan.nextInt(); //scan second number input.
	    
	    if (firstValue <200 || firstValue >1000) {
	    	System.out.println("First number is out of range.");
	        System.out.println("Integer must be between 200 and 1000."); //Data input by user.
	       	scan.close(); //closes scan if true
	    }
	    else if (secondValue <200 || secondValue >1000) {
	        System.out.println("Second number is out of range.");
	        System.out.println("Integer must be between 200 and 1000."); //Data input by user.
	        scan.close();
	    }
	    
	    else if (secondValue >=200 || secondValue <=1000) {
	        System.out.print("Enter operation symbol (+, -, *, or /): ");
	     	char operator = scan.next().charAt(0);
	     	
	     	if (operator == '+') {
	     		float answer = firstValue + secondValue; 
				System.out.print("Evaluation: ");
				System.out.print(firstValue + "+" + secondValue + " = " + answer);
	     	}
	     	else if  (operator == '-' ) { 
	     		float answer = firstValue - secondValue; 
				System.out.print("Evaluation: ");
				System.out.print(firstValue + "-" + secondValue + " = " + answer);
	     	}
	     	else if  (operator == '*' ) {
	     		float answer = firstValue * secondValue; 
				System.out.print("Evaluation: ");				
				System.out.print(firstValue + "*" + secondValue + " = " + answer);
	     	}
	     	else if  (operator == '/' ) { 
	     		float answer = (float)firstValue / secondValue; 
				System.out.print("Evaluation: ");
				System.out.print(firstValue + "/" + secondValue + " = " + answer);
	     	}
	     	else { //displays error message if a symbol is input other than +, -, *, or /
	     		System.out.println("Invalid operation symbol. ");
				System.out.println("Please use one of the followng, +, -, *, or /");
				scan.close(); 
	     	}
	    }
	}
}
