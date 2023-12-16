import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of integers n: ");
		int n = scanner.nextInt();

		System.out.println("Enter " + n + " integers:");
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}

		System.out.println("Numbers divisible by 3 or 9:");
		for (int num : numbers) {
			if (num % 3 == 0 || num % 9 == 0) {
				System.out.print(num + " ");
			}
		}

		scanner.close();
	}
}
