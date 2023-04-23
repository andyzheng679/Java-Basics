package basic;
import java.util.Scanner;

public class conditional_statements_operation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give speed: ");
		int speed = Integer.valueOf(scanner.nextLine());
		
		if(speed > 120) {
			System.out.println("Speeding ticket!");
		}
		
		System.out.println("Give number: ");
		int number = Integer.valueOf(scanner.nextLine());
		
		if(number == 1984) {
			System.out.println("Orwell");
		}
		
		System.out.println("Give year: ");
		int year = Integer.valueOf(scanner.nextLine());
		
		if(year < 2015) {
			System.out.println("Ancient History");
		}
		
		System.out.println("Give number: ");
		int number2 = Integer.valueOf(scanner.nextLine());
		
		if(number2 > 0) {
			System.out.println("The number is positive.");
		} else {
			System.out.println("The number is not positive.");
		}
		
		System.out.println("Give first number: ");
		int first_num = Integer.valueOf(scanner.nextLine());
		
		System.out.println("Give second number: ");
		int second_num = Integer.valueOf(scanner.nextLine());
		
		if (first_num > second_num) {
			System.out.println("Greater number: " + first_num);
		} else if (first_num < second_num) {
			System.out.println("Greater number: " + second_num);
		} else {
			System.out.println("They are both equal");
		}
		
		System.out.println("Give number: ");
		int num = Integer.valueOf(scanner.nextLine());
		
		if(num >= 0 && num <= 50) {
			System.out.println("number is in between 1 and 50");
		}
		
		System.out.println("Give odd or even number: ");
		int oe_num = Integer.valueOf(scanner.nextLine());
		
		if (oe_num % 2 == 0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
		
		
		

	}

}
