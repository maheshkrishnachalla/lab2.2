package in.main;

import java.util.Scanner;

public class ReverseString {

	public static String reverseEachCharacter(String str) {
		StringBuilder builder = new StringBuilder();
	 char[] ch = str.toCharArray();
	 for(int i=ch.length-1;i>=0;i--) {
		 builder.append(ch[i]);
	 }
		return builder.toString();
	}
	
	public static String reverseEachWord(String str) {
		StringBuilder builder = new StringBuilder();
	
		
	 String[] ch = str.split(" ");
	 for(int i=ch.length-1;i>=0;i--) {
		 builder.append(ch[i]+" ");
	 }
		return builder.toString().trim();
	}
	
	public static String reverseEachCharacterinWord(String str) {
		StringBuilder builder = new StringBuilder();
	 String[] ch = str.split(" ");
	 for(int i=0;i<ch.length;i++) {
		 String reverseStr = reverseEachCharacter(ch[i]);
		 
		 builder.append(reverseStr+" ");
	 }
		return builder.toString().trim();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = scanner.nextLine();
		System.out.println(reverseEachCharacter(str));
		System.out.println(reverseEachWord(str));
		System.out.println(reverseEachCharacterinWord(str));
	}
}
