package in.main;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRearrange {

	public static int[] rearrange(int k, int[] array) {
		int n = array.length;
		int r = n/k;
		int q = n%k;
		int[] swapped = new int[n];
		int p=0;
		int c =0;
		int temp =0;
		for(int i=0;i<r;i++) {
			int m =k;
			for(int j=c;j<k;j++) {
				swapped[j]=array[m-1];
				m=m-1;
				p=p+1;
			}
			k = k+p;
			c=c+p;
			p=0;
		}
		int e=0;
		/*for(int i=n-q;i<n;i++) {
			swapped[i]=array[n-1-e];
			e++;
			
		}*/
		for(int i=n-1;i>n-q-1;i--) {
			swapped[i]=array[i];
			e++;
			
		}
		array =null;
		return swapped;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of elements in Array = ");
		try {
			int n = scanner.nextInt();
			int[] arr = new int[n];
			//System.out.println("Enter elements in Array = ");
			for(int i=0;i<n;i++) {
				arr[i]= i+1; //scanner.nextDouble();
			}
			System.out.println(Arrays.toString(arr));
			System.out.println("Enter Window slide in Array = ");
			int k = scanner.nextInt();
			int[] slider = rearrange(k, arr);
			System.out.println(Arrays.toString(slider));
		}catch(Exception e) {
			e.printStackTrace();
		}

		
	}
}
