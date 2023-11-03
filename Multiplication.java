package loops;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		
		}
	}

}
