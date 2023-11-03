package loops;

import java.util.Scanner;

public class Countdigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num ");
		int num = sc.nextInt();
		System.out.println("enter the num of digis ");
		int digit = sc.nextInt(); //1234
		int count=0 ;
		for(int i=num; i>0; i--) {
			digit=digit/10; //123--12--1--0
			count++;  //1--2---3--
			
		}
		System.out.println(count);
		
	}

}
