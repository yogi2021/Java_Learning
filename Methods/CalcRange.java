package Methods;

import java.util.Scanner;

public class CalcRange {

	void displayOddrange(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		CalcRange obj = new CalcRange();
		// obj.displayEvenRange(12, 22);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enetr starting number:");
		int start = sc.nextInt();

		System.out.println("Enetr Ending number:");
		int end = sc.nextInt();
		obj.displayOddrange(start, end);
		sc.close();
	}
}