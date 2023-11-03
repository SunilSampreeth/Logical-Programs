package loops;

import java.util.Scanner;

public class ArmstrongNum1To1000 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt(); //1000

		
		for(int i=1; i<=num; i++) {
			int sum = 0;
			int n=i; // 1--2--3--4--5...
			while(n!=0) {
			int rem = n % 10;// find the remainder
			sum = sum + (rem * rem * rem);// cube of each digits and sum
			n = n/ 10;// find the new value
			}
			if(sum==i)
			System.out.println(sum);
		}
		
	}

}
