package exception;

public class Arith {
	public static void main(String[] args) {
		System.out.println("hi");
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
		}
		
		catch(Exception e) {
//			System.out.println("Dont try");
		//	System.out.println(e);			//java.lang.ArithmeticException: / by zero
			e.printStackTrace();			//java.lang.ArithmeticException: / by zero	at java/exception.Arith.main(Arith.java:9)
		}
	}

}
