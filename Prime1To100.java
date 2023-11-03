package loops;

import java.util.Scanner;

public class Prime1To100 {
	public static void check(int nums) {
		for(int i=0; i<nums; i++) {
			int count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int arr = sc.nextInt();
		check(arr);
	}

}
