package in.main;

import java.util.Scanner;

public class EvenorOddNumber {

	public static boolean isEven(int n) {
		if((n&1)==0) {
			return true;
		}
		return false;
	}

	public static boolean isOdd(int n){
		if(n%2!=0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter Number : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		long startTime = 0L;
		long endTime = 0L;
		startTime= System.currentTimeMillis()/1000L;
		System.out.println(startTime);
		if(isEven(num)) {
			System.out.println(num + " is Even Number");
		}
		endTime = System.currentTimeMillis()/1000L;
		System.out.println(endTime);
		startTime= System.currentTimeMillis()/1000L;
		System.out.println(startTime);
		if(isOdd(num)) {
			System.out.println(num+ " is Odd Number");  
		}
		endTime = System.currentTimeMillis()/1000L;
		System.out.println(endTime);

		
	}
}
