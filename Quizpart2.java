package MinElementChallenge;

import java.util.Scanner;

public class MinElement {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		int count = scanner.nextInt();
		int[] integers = readIntegers(count);
		int min = findMin(integers);
		System.out.println("Minimum element in the array: " + min);
	}

	public static int[] readIntegers(int count) {
		int[] array = new int[count];
		for (int i = 0; i < count; i++) {
			System.out.print("Enter integer " + i  + ": ");
			array[i] = scanner.nextInt();
		}
		return array;
	}

	public static int findMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for (int num : array) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}
}

