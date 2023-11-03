package loops;

import java.util.Scanner;

public class NaturalNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the nunm ");
		int n = sc.nextInt();
		int sum=0, i=1;
		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}

}
