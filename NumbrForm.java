package exception;

public class NumbrForm {
	public static void main(String[] args) {
		String a="TN57";
		try {
		int b=Integer.parseInt(a);
		System.out.println(b);
		}
		catch(Exception e) {
		System.out.println("Numbr error"); // java.lang.NumberFormatException: For input string: "TN57"
		}
	}

}
