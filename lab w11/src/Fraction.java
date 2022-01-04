import java.lang.Math;
public class Fraction {
	private int num;
	private int den;
	
	public Fraction(int num, int den) {
	   	this.num = num;
	   	this.den = den;
	   	
	}
	
	public Fraction() {
		this.num = 0;
		this.den=1;
	}
	
	public Fraction(Fraction source) {
		this.den=source.den;
		this.num=source.num;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public int getDen() {
		return this.den;
	}
	
	public void setNum(int num) {
		this.num=num;
	}
	
	public void setDen(int den) {
		if(den==0) {
			System.out.println("Cannot use zero for denominator!!");
		} else {
		    this.den= den;
		}
	}
	
	public void addFraction(Fraction f) {
		this.num = (this.num * f.den) + (f.num * this.den);
		this.den = this.den * f.den;
		
	}
	
	public double size() {
		return Math.abs((double) num/den);
	}
	
	public Fraction larger(Fraction f) {
	     if(this.size()>f.size()) {
	    	 return this ;
	     } else {
	    	 return f; 
	     }
	}
	
	public void inverse() {
		if(this.num==0 || this.den==0) {
			System.out.println("error aq");
		} else {
			int a = this.num;
			this.num = this.den;
			this.den = a;
		}
	}
	
	public boolean equals(Fraction f) {
		return this.den==f.getDen() || this.num==f.getNum();
	}
	
	public String toString() {
		return "\n" + this.num + "/" + this.den + ": " + Math.abs((double) num/den);
	}

}
