package exception;


public class StackErr {
	
	public float a() {
		return b();
	}
	public float b() {
		return a();
		
	

}
	public static void main(String[] args) {
		StackErr s=new StackErr();
		s.a();
		s.b();
	}
}
