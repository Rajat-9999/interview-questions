package question;
import java.util.Scanner;

public class calculator {
		 
	public static void main(String[] args) {
			Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter the first number");
		double a= obj1.nextDouble();
		System.out.println("Enter the second number");
		double b= obj1.nextDouble();
		System.out.println("Enter any oparation between "+"+"+" or -"+" or *"+" or /");
		char typeofoparation =obj1.next().charAt(0);
		
		if (typeofoparation=='+') {
			System.out.println("out put= "+(a+b));
		}
		else if (typeofoparation=='-') {
			System.out.println("out put="+(a-b));
		}
		else if (typeofoparation=='*') {
			System.out.println("out put="+(a*b));
		}
		else if (typeofoparation=='/') {
			System.out.println("out put="+(a/b));
		}
		else {
			System.out.println("invalid oparation entered");
		}
		
		
		}
	}


