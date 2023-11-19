package interview;

public class Main {

	public static void main(String[] args) {

		int[] numbers = { 2, 3, 1, 5, 6, 22, 8, 9, 7, 19 };
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {

			if (min > numbers[i]) {
				min = numbers[i];
			}

		}
		System.out.println("Smallest number in given array is " + min);

	}

}
