package basic;
import java.util.ArrayList;
import java.util.Scanner;


public class lists {

	public static void main(String[] args) {
		/*
		ArrayList<Integer> integers = new ArrayList<>();
		int integer = 1;
		integers.add(integer);
		
		ArrayList<Double> doubles = new ArrayList<>();
		double d = 4.2;
		doubles.add(d);
		
		ArrayList<String> wordList = new ArrayList<>();
		
		wordList.add("First");
		wordList.add("Second");
		
		System.out.println(wordList.get(0));
		*/
		Scanner scanner = new Scanner(System.in); 
		ArrayList<Integer> secondPlusThird = new ArrayList<>();
		
		/*
		while(true) {
			System.out.println("Enter a number, enter 0 to stop: ");
			
			int input = scanner.nextInt();
			
			if (input == 0) {
				break;
			}
			
			secondPlusThird.add(input);
		}
		
		if (secondPlusThird.size() >= 3) {
			int sum = secondPlusThird.get(1) + secondPlusThird.get(2);
			System.out.println(sum);
		} else {
			System.out.println("Not enough numbers entered");
		}
		*/
		
		while (true) {
			System.out.println("Enter some numbers, enter 0 to stop");
			
			int input = scanner.nextInt();
			
			if (input == 0) {
				break;
			}
			secondPlusThird.add(input);
		}
		System.out.println(secondPlusThird.get(secondPlusThird.size() -1));
		
		
	}

}
