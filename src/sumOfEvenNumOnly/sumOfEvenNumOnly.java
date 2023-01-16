package sumOfEvenNumOnly;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sumOfEvenNumOnly {

	static Scanner sc = new Scanner(System.in);

	public static List<int[]> findpairs(int[] numbers, int targetSum) {
		List<int[]> pairs = new ArrayList<>();
		for (int i = 1; i < numbers.length; i+=2) {
			for (int j = i + 2; j < numbers.length; j+=2) {
				if (numbers[i] + numbers[j] == targetSum) {
					pairs.add(new int[] { numbers[i], numbers[j] });
				}
			}
		}
		return pairs;
	}

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		System.out.println("Enter the required Sum that is not bigger than 10:");
		int targetSum = sc.nextInt();
		System.out.println("\n");

		List<int[]> pairs = findpairs(numbers, targetSum);
		for (int i = 0; i < numbers.length; i++) {

		}
		for (int[] pair : pairs) {
			System.out.println("First Number is: " + pair[0] + " , " + "Second Number is: " + pair[1]);
		}

	}
}
