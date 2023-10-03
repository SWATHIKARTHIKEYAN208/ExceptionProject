package exception;

public class Login extends Exception {
	public void checkPassword(String a)throws Exception {
		if(a.length()>8) {
		System.out.println("Login successfully");
	}
		else {
			throw new Exception("Password Exception");
			
		}
	}

}
