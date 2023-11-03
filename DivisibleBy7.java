package loops;

import java.util.Scanner;

public class DivisibleBy7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enetr the first num");
		int num = scan.nextInt();
		for (int i = 0; i <= num; i++) {
			if (i % 7 == 0 && i % 5 == 0)
				System.out.println(i);
		}
	}
}