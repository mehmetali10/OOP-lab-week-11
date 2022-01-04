
public class TestFraction {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(1,8);
		Fraction f2 = new Fraction(1,3);
		
		System.out.println("f1  " + f1);
		System.out.println("\nf2  " + f2);
		
		f1.addFraction(f2);
		System.out.println("\nf1  " + f1);
		
		Fraction f3 = new Fraction(f1);
		System.out.println("\nf3: " + f3);
		
		System.out.println("\nDoes f1 and f3 equal to each other? " + f1.equals(f3));
        
		f2.inverse();
		System.out.println("\nf2 " + f2);
		
		System.out.println("\nwhich one is larger f1 or f2 ? display the result object" + f1.larger(f2));

	}

}
