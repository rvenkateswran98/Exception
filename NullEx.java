package exception;

public class NullEx {

	public static void main(String[] args) {
		
		
		System.out.println("WellCome");
		String a=null;
		try {
		System.out.println(a.toUpperCase());
		}
		catch (ArithmeticException ae) {
			System.out.println("Aruth");
		}
		catch (NullPointerException ne) {
			
			System.out.println(ne);
		}
		catch(Exception ee) {
			System.out.println("Somthing went worng");
		}
		
		System.out.println("ThankYou");
		
		
		
		
		
		
	}

}
