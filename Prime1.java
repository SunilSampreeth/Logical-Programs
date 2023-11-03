package loops;

import java.util.Scanner;

public class Prime1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = sc.nextInt();

		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 0)
			System.out.println("prime number");
		else
			System.out.println("not a prime num");
	}

}
