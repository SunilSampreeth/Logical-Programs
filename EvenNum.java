package loops;

import java.util.Scanner;

public class EvenNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr the num");
		int num = scan.nextInt();
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0)
				System.out.println(i);

		}
	}

}
