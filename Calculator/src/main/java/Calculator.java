
public class Calculator {

	public static void main(String atg []) {
		
		Functions fun = new Functions();
		
		int ans= (int) fun.add(5,10);
		System.out.println("add" + ans);
		
		System.out.println("sub" + (int) fun.sub(15,10));
		
		
		
		double a= fun.div(25, 5);
		System.out.println("div" + a);
		
		double c= fun.mul(25, 5);
		System.out.println("mul" + c);
		
		
		
		
	}
}
