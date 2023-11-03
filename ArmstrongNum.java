package loops;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt(); // 153

		int sum = 0, temp = num, rem;
		while (num > 0) {
			rem = num % 10;// find the remainder
			sum = sum + (rem * rem * rem);// cube of each digits and sum
			num = num / 10;// find the new value
		}
//		System.out.println(temp);
//		System.out.println(sum);
		if (sum == temp)
			System.out.println("Armstrong number");
		else
			System.out.println("not armstrong number");
	}
}
