package basic;
import java.util.Scanner;

public class extra_practice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give number: ");
		int number = Integer.valueOf(scanner.nextLine());
		
		int square = number * number;
		System.out.println(square);
		
		
		System.out.println("Give first number: ");
		int number1 = Integer.valueOf(scanner.nextLine());
		System.out.println("Give second number: ");
		int number2 = Integer.valueOf(scanner.nextLine());
		
		double sum_squared = Math.sqrt(number1 + number2);
		System.out.println(sum_squared);
		
		System.out.println("Give a number: ");
		int absolute_num = Integer.valueOf(scanner.nextLine());
		
		if (absolute_num < 0) {
			System.out.println(absolute_num * -1);
		} else {
			System.out.println(absolute_num);
		}

	}

}
