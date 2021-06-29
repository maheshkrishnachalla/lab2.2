package in.main;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayAverageSlideWindow {

	public static double[] windowArray(int k,double[] array) {
		double sum = 0;
		int i=0;
		double[] windowSlide = new double[array.length-k+1];
		for(int j=0;j<windowSlide.length;j++) {
			sum =sum+array[k+j-1];
			while(i<k-1) {
				sum+= array[i];
				i++;
			}
			windowSlide[j]=sum/k;
			sum = sum-array[j];
		}
		return windowSlide;

	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of elements in Array = ");
		try {
			int n = scanner.nextInt();
			double[] arr = new double[n];
			//System.out.println("Enter elements in Array = ");
			for(int i=0;i<n;i++) {
				arr[i]= i+1 ; //scanner.nextDouble();
			}
			System.out.println(Arrays.toString(arr));
			System.out.println("Enter Window slide in Array = ");
			int k = scanner.nextInt();
			double[] slider = windowArray(k, arr);
			System.out.println(Arrays.toString(slider));
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
