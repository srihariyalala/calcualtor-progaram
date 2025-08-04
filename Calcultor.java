package Java_Console_Calculator;

import java.util.Scanner;

public class Calcultor {
	
	int n;
	public static int addition(int a, int b){
		
		return a+b;
	}
	
public static int substraction(int a, int b){
		
		return a-b;
	}
		

public static int multiplication(int a, int b){
	
	return a*b;
}
public static double division(int a, int b){
	
	if (b == 0) {
        System.out.println("Error: Division by zero");
        return 0;
    }
    return (double) a / b;
    
}

	
	public static void main(String[] args) {
		
		
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n Calculator Menu ");
	            System.out.println("1. Add");
	            System.out.println("2. Subtract");
	            System.out.println("3. Multiply");
	            System.out.println("4. Divide");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice (1-5): ");
	            choice = scanner.nextInt();

	            if (choice == 5) {
	                System.out.println("Exit the calculator");
	                break;
	            }

	            System.out.print("Enter first number: ");
	            int num1 = scanner.nextInt();
	            System.out.print("Enter second number: ");
	            int num2 = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Result: " + addition(num1, num2));
	                    break;
	                case 2:
	                    System.out.println("Result: " + substraction(num1, num2));
	                    break;
	                case 3:
	                    System.out.println("Result: " + multiplication(num1, num2));
	                    break;
	                case 4:
	                    System.out.println("Result: " + division(num1, num2));
	                    break;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }

	        } while (true);

	        scanner.close();
	    
	
	}
		
	}
