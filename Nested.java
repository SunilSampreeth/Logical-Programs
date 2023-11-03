package loops;

import java.util.Scanner;

public class Nested {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row ");
		int row = sc.nextInt();
		System.out.println("enter the cal ");
		int cal = sc.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=cal; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
		
	}
	

}
