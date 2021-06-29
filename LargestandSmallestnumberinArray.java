package in.main;


public class LargestandSmallestnumberinArray {

	static int[] array = {1,5,2,7,3,2,3,6,1,5,1,1,7,33,22,6,6,0,34,7,9,8,6,9};
	
	public static int largestNumberinArray(int[] n) {
		int max =n[0];
		for(int i=1;i<n.length;i++) {
			if(n[i]>max) {
				max = n[i];
			}
		}
		return max;
		
	}
	
	public static int smallestNumberinArray(int[] n) {
		int min =n[0];
		for(int i=1;i<n.length;i++) {
			if(n[i]<min) {
				min = n[i];
			}
		}
		return min;
		
	}
	
	public static void main(String[] args) {
			int largest = largestNumberinArray(array);
			System.out.println("Largest Number in Array : "+largest);
			int smallest = smallestNumberinArray(array);
			System.out.println("smallest Number in Array : "+smallest);
			
			
		}

}
