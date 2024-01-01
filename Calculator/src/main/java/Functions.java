
public class Functions {
	private double a;
	private double b;
	private double c;
	
	public double add(int a, int b) {
		c=a+b;
		return c;
		
	}
	public double sub (int a, int b) {
		c=a-b;
		return c;
		
	}
	public double mul(int a, int b) {
		c=a*b;
		return c;
		
	}public double div(int a, int b) {
		c=a/b;
		return c;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	

}
