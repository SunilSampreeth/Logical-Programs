package loops;

import java.util.Scanner;

public class NatureOfnnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n number");
		int a = sc.nextInt();
		int i=1;
		do {
			System.out.println(i);
			i++;
			
		}while(i<=a);

	}

}
