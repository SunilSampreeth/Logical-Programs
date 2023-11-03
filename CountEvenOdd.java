package loops;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enetr the first num");
		int num = scan.nextInt();
		int even = 0, odd = 0;
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Even Number is " + even);
		System.out.println("Odd Number is " + odd);
	}
}