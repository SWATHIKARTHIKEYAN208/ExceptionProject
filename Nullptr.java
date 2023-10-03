package exception;

public class Nullptr {
	public static void main(String[] args) {
		String n=null;
		try {
		System.out.println(n.toUpperCase()); // java.lang.NullPointerException
		}
		catch(Exception e) {
			System.out.println("String is null");
		}
	}

}
