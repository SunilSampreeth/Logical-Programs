package loops;

import java.util.Scanner;

public class MonthyBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month");
		int month = sc.nextInt();

		int days = month * 30, bill = 0;
		if (month >= 1) {
			bill = (10 * days)-1;

		}
		System.out.println(month + " month telephone bill is  " + bill);

	}
}