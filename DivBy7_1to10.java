package loops;

import java.util.Scanner;

public class DivBy7_1to10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		int count=0;
		for(int i=2; i<=10; i++) {
			if(num%i==0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
