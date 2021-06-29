package in.main;

public class CompareTwoObjects {
	
	
	public static void main(String[] args) {
		Double x = new Double(238.4748);
		Double y = new Double(584.4736);
		Double z = new Double(584.4736);
		
		String a = "Hi";
		String b = "Hi";
		
		StringBuilder c = new StringBuilder("Hi");
		
		System.out.println(" x hashCode : "+ x.hashCode());
		System.out.println(" y hashCode : "+ y.hashCode());
		System.out.println(" z hashCode : "+ z.hashCode());
		
		
		System.out.println("x==y : "+(x==y));
		System.out.println("x.equals(y) : "+(x.equals(y)));
		System.out.println("y==z : "+(y==z));
		System.out.println("y.equals(z) : "+(y.equals(z)));
		System.out.println("x==z : "+(x==z));
		System.out.println("x.equals(z) : "+(x.equals(z)));
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
		
	}

}
