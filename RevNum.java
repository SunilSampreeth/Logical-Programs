package loops;

import java.util.Scanner;

public class RevNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row ");
		int num = sc.nextInt();
		int rev=0, rem;
		while(num>0){
			rem=num%10; // find the remainder
			rev=rev*10+rem; // find the reverse
			num=num/10; // find the new value
			}
		System.out.println(rev);
	}

}
