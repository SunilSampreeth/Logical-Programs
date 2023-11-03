package loops;

import java.util.Scanner;

public class CountAlphaNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alphanumaric");
		String str = sc.nextLine();

		int alpha = 0, number = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				alpha++;

			else
				number++;
		}

		System.out.println("alphabets " + alpha);
		System.out.println("numbers " + number);

	}

}
