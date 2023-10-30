/*Create a program using arrays that sorts a list of integers in descending order.
//Descending order is highest value to lowest.
//In other words if the array had the values in it 106, 26, 81, 5, 15 your program
should
//ultimately have an array with 106,81,26, 15, 5 in it.
//Set up the program so that the numbers to sort are read in from the keyboard.
//Implement the following methods - getIntegers, printArray, and sortIntegers
//getIntegers returns an array of entered integers from keyboard
//printArray prints out the contents of the array
//and sortIntegers should sort the array and return a new array containing the sorted
numbers
//you will have to figure out how to copy the array elements from the passed array
into a new
//array and sort them and return the new sorted array.*/

package com.icraft.DescendingOrder;

import java.util.Scanner;
public class DescendingOrder { 
	
	public static void main(String[] args) {
		int[] integers = getIntegers();
		int[] sortedIntegers = sortIntegers(integers); 
		System.out.println("Original array:"); 
		printArray(integers); 
		System.out.println("Sorted array in descending order:"); 
		printArray(sortedIntegers);
		}
	
	
	public static int[] getIntegers() {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter the Orginal number : "); 
		System.out.println();
		int num = scanner.nextInt(); 
		int[] integers = new int[num]; 
		for (int i = 0; i < num; i++) {
			System.out.print("Enter integer " + i  + ": ");
			integers[i] = scanner.nextInt(); 
			}
		return integers;
		}
	public static void printArray(int[] arr) { 
		for (int num : arr) {
			System.out.print(num + " "); 
			}
		System.out.println();
		}
	public static int[] sortIntegers(int[] arr) {
		int[] sortedArray = new int[arr.length];
		System.arraycopy(arr, 0, sortedArray, 0, arr.length);
		
		for (int i = 0; i < sortedArray.length - 1; i++) { 
			for (int j = i + 1; j < sortedArray.length; j++) { 
				if (sortedArray[i] < sortedArray[j]) { 
					int temp = sortedArray[i];
					sortedArray[i] = sortedArray[j];
					sortedArray[j] = temp; 
					}
			}
			}
		return sortedArray;
		}
}
