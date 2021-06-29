package in.main;

import java.util.Arrays;
import java.util.Scanner;

public class LongestNameinList {
	
	public static String longest(String[] arr) {
		int max =Integer.MAX_VALUE;
		String name ="";
		name = arr[0];
		max = arr[0].length();
		for(int i=1 ; i<arr.length;i++) {
			if(max<arr[i].length()) {
				max = arr[i].length();
				name= arr[i];
			}
			
		}
		
		return name;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter Names : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] array = new String[n];
		for(int i=0;i<n;i++) {
			array[i] = scanner.next();
		}
		System.out.println(longest(array));
	}

}
