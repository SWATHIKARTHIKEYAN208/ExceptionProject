package exception;

public class Finaly {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
		}
		finally {
			System.out.println("Show this");
		}
		System.out.println("end");
	}

}
