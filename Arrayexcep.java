package exception;

public class Arrayexcep {
	public static void main(String[] args) {
		int[] a= {2,4,3,2};
		try {
			System.out.println(a[4]);
		}
		catch(Exception e) {
			System.out.println("Excep");
		}
	}

}
