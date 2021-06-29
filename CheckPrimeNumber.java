package in.main;

import java.util.Scanner;

public class CheckPrimeNumber {
	
	public static boolean isPerfectNumber(int num) {
		try {
			if(num<2) {
				throw new Exception("1 is Not Prime or composite Number or Perfect Number and Please Enter Natural Numbers");
			}
		int sum =1;
		for(int i=2;i*i<=num;i++) {
			if(num%i==0) {
				if(i*i!=num) {
					sum = sum+i+num/i;
				}
				else {
					sum=sum+i;
				}
			}
			
		}
		if(sum==num && num!=1) {
			return true;
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean isPrime(int num) {
		try {
			if(num<2) {
				throw new Exception("1 is Not Prime or composite Number and Please Enter Natural Numbers");
			}
		for (int i=2;i*i<=num;i++) {
			if(num%i==0) {
				return false; 
			}
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public static void listofPrimes(int start, int end) {
		System.out.println("List of Primes");
		try {
			if(start<2||end<2||start>end) {
				throw new Exception("1 is Not Prime or composite Number and Please Enter Natural Numbers Start number should les or equal to End nmuber");
			}
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter Min Number :");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		/*
		 * if(isPerfectNumber(number)) { System.out.println(number +
		 * " is Perfect Number"); } else { System.out.println(number +
		 * " is Not Perfect Number"); }
		 */
		if(isPrime(number)) {
			System.out.println(number + " is Prime Number");
		}
		else {
			System.out.println(number + " is Not Prime Number");
		}
		System.out.println("Enter Max Number :");
		int maxNum = scanner.nextInt();
		listofPrimes(number, maxNum);
	}
}
