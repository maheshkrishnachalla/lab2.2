package in.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AverageofNumbersinArray {

	public static double[] averageofNumbers(int k, double[] array) {
		int n = array.length;
		int r = n/k;
		int q = n%k;
		int p=0;
		int c =0;
		double sum =0;
		for(int i=0;i<r;i++) {
			for(int j=c;j<k;j++) {
				sum=sum+array[j];
				p=p+1;
			}
			for(int j=c;j<k;j++) {
				array[j]=sum/p;
			}
			k = k+p;
			c=c+p;
			p=0;
			sum=0;
		}
		return array;
	}
	
	public static double[] averageofNumbersintoArray(int k, double[] array) {
		int n = array.length;
		int r = n/k;
		int q = n%k;
		int p=0;
		int c =0;
		double sum =0;
		double[] windowSlide = new double[r+q];
		int m=windowSlide.length;
		for(int i=0;i<r;i++) {
			for(int j=c;j<k;j++) {
				sum=sum+array[j];
				p=p+1;
			}
			windowSlide[i]=Math.ceil(sum/p);
			k = k+p;
			c=c+p;
			p=0;
			sum=0;
		}
		int e=1;
		for(int i=m-1;i>m-q-1;i--) {
			windowSlide[i]=array[n-e];
			e++;
			
		}
		
		return windowSlide;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of elements in Array = ");
		try {
			int n = scanner.nextInt();
			double[] arr = new double[n];
			Random random = new Random();
			//System.out.println("Enter elements in Array = ");
			for(int i=0;i<n;i++) {
				int x= random.nextInt(n);
				arr[i]= x+i; //i+1; //scanner.nextDouble();
			}
			System.out.println(Arrays.toString(arr));
			System.out.println("Enter Window slide in Array = ");
			int k = scanner.nextInt();
			//double[] slider = averageofNumbers(k, arr);
			double[] slider2 = averageofNumbersintoArray(k, arr);
			//System.out.println(Arrays.toString(slider));
			System.out.println(Arrays.toString(slider2));
		}catch(Exception e) {
			e.printStackTrace();
		}

		
	}

}
