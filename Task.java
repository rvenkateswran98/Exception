package exception;

public class Task {
	public static void main(String[] args) {
		
		
		System.out.println("WellCome");

		int a=10;
		int b=0;
		try {
		System.out.println(a/b);
		}
		catch(ArithmeticException ae) {
			System.out.println("Please Enter Valid Number");
		}
		System.out.println(a+b);
		System.out.println("ThankYou");
		
		
		
		
	}
	
	

}
