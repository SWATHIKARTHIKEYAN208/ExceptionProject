package exception;

public class StringExcep {
	public static void main(String[] args) {
		String name="swathi";
		try {
			System.out.println(name.charAt(6));
		}
		catch(Exception e) {
			System.out.println("Excep");
		}
		
		
	}

}
