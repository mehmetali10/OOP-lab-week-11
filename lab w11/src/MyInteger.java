
public class MyInteger {
	private int value;
	private static int maxInt=10000;
	
	public MyInteger(int value) {
		if(value>maxInt) {
			this.value = maxInt;
		} else {
			this.value=value;
		}
		
	}
	
	public int getValue() {
		return this.value;
	}
	
	public boolean isEven() {
		return value%2==0;
	}
	
	public static boolean isEven(MyInteger myInt) {
	  	return myInt.getValue()%2==0;
	}
	
	public boolean equals(int value) {
		return this.value==value;
	}
	
	public boolean equals(MyInteger myInt) {
		return this.value == myInt.getValue();
	}
	
	public void add(int value) {
			this.value += value;
			
			if(this.value> maxInt) {
				this.value = maxInt;
			}
	}
	
	public void add(MyInteger myInt) {
		this.value += myInt.getValue();
		
		if(this.value>maxInt) {
			this.value = maxInt;
		}
	}
	
	public String info() {
		return "The value is: " + this.value;
	}

}
