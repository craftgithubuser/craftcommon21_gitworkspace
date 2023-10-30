package Quiz1;

import java.util.Arrays;

public class Chalenge3 {

	public static void main(String[] args) {
        int[] Number = {1,2,3,4,5};

        System.out.println("Original Number:");
        System.out.println(Arrays.toString(Number));

        reverseWordsArray(Number);

        System.out.println("Reversed Number:");
        System.out.println(Arrays.toString(Number));
    }

    public static void reverseWordsArray(int[] number) {
        int start = 0;
        int end = number.length - 1;

        while (start < end) {
            // Swap words at 'start' and 'end' positions
        	
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;

          start++;
          end--;
        }
    }
}