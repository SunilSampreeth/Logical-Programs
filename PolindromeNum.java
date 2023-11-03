package loops;

import java.util.Scanner;

public class PolindromeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt(); //898
		
		int  rev=0, rem, temp=num;
		while(num>0) {
			rem=num%10;
			rev=rem+rev*10; // reverse the number
			num=num/10;
		}
		//System.out.println(temp);
		//System.out.println(rev);
		if(temp==rev) {
			System.out.println("polindrme number");
		}
		else
			System.out.println("Not a polindrome number");
	}
}
