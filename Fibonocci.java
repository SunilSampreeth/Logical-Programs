package loops;

import java.util.Scanner;

public class Fibonocci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = sc.nextInt();
		
		int num1=0, num2=1, num3;
		for(int i=1; i<=num; i++) {
			System.out.println(num1);
			num3=num1+num2;
			num1=num2;
			num2=num3;
		}
	}

}
