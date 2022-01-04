
public class TestMyInteger {

	public static void main(String[] args) {
		
		MyInteger myInt = new MyInteger(24);
		System.out.println(myInt.info());
		System.out.println("Does second object even?\n" + MyInteger.isEven(myInt));
		
		MyInteger myInt2 = new MyInteger(35);
		System.out.println(myInt2.info());
		
		System.out.println("Does object 1 and 2 equal?\n" + myInt.equals(myInt2));
		
		myInt.add(myInt2);
		System.out.println(myInt.info());
	}

}
