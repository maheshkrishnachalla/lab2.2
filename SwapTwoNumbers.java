package in.main;

public class SwapTwoNumbers {
	
	public static void swapTwoNumbers(int a, int b) {
		System.out.println("before swap :"+ a+" "+b);
		int c=0;
		c= a;
		a=b;
		b=c;
		System.out.println("after swap :"+ a+" " +b);
	}

	public static void swapTwoNumberswithoutThirdVariale(int a, int b) {
		System.out.println("before swap :"+ a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap :"+ a+" " +b);
	}
	
	public static void main(String[] args) {
		swapTwoNumbers(5, 6);
		swapTwoNumberswithoutThirdVariale(5, 6);
	}
}
