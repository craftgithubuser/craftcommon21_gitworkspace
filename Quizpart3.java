package ReverseArrayChallenge;

public class ReverseArray {

		public static void main(String[] args) {
			int[] originalArray = { 1, 2, 3, 4, 5 };
			System.out.println("Original Array Numbers:" + " ");
			printArray(originalArray);
			
			reverse(originalArray);
			System.out.println();
			
			System.out.println("Reversed Array:" + " ");
			printArray(originalArray);
			
			
		}
		

		public static void reverse(int[] array) {
			int i = 0;
			int n = array.length - 1;
			while (i < n) {
				int temp = array[i];
				array[i] = array[n];
				array[n] = temp;
				i++;
				n--;
			}
		}

		public static void printArray(int[] array) {
			for (int num : array) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

