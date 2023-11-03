package loops;

import java.util.Scanner;

public class Perfect1To100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++) { 
			int sum=0;
			for(int j=1; j<i; j++) {
				if(i%j==0) {
					sum=sum+j;
				}
			}
			if(i==sum)
				System.out.println(i);
		}
	}

}
