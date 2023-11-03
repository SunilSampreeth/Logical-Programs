package loops;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		
		int rev=0;
		while(num>0) {
			int rem=num%10; //Find the remainder
			rev=rem+rev*10; //to find the reverse num
			num=num/10; //to find new value od num in order to loop
			
		}
		System.out.println(rev);
	}
}
