package exception;

public class SingleTryMultiCatch {
	public static void main(String[] args) {
		String a="swathi";
		try {
			System.out.println(a.charAt(8));
		}
		
		
		catch(NullPointerException e2) {
			System.out.println("null");
		}
		catch(NumberFormatException e3) {
			System.out.println("Number");
		}
		catch(ArithmeticException e4) {
			System.out.println("arith");
		}
		catch(Exception e4) {
			System.out.println("Not char");
		}
		
		
	}

}
