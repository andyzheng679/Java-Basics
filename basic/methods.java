package basic;
import java.util.Scanner;

public class methods {

	public static void main(String[] args) {
		
		/*
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("How many times?");
		int input = Integer.valueOf(scanner.nextLine());
		
		for (int i = 0; i < input; i++) {
			printText();
		}
		*/
		/*
		printUntilNum(5);
		*/
		/*
		printFromNumberToOne(5);
		*/
		/*
		division(3, 5);
		*/
		/*
		divisableByThreeRange(2, 10);
		*/
		System.out.println(numberUno());
		System.out.println(word());
		functioningMethod(3);
		



	}
	
	public static void printText() {
		System.out.println("In the hole in the ground there lived a method");
	}
	
	public static void printUntilNum(int number) {
		for (int i = 1; i <= number; i++) {
			System.out.println(i);
		}
	}
	
	public static void printFromNumberToOne(int number) {
		for (int i = number; i >= 1; i--) {
			System.out.println(i);
		}
	}
	
	public static void division(double num, double den) {
		System.out.println(num/den);
	}
	
	public static void divisableByThreeRange(int num1, int num2) {
		for (int i = num1; i <= num2; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static int numberUno() {
		return 1;
	}
	
	public static String word() {
		return "Testing";
	}
	
	public static int functioningMethod(int parameter) {
	    if (parameter > 10) {
	        return 10;
	    }

	    System.out.println("The number received as parameter is ten or less.");

	    return parameter;
	}

}
