package exception;

import java.util.Scanner;

public class UseLogin extends Login {
	public static void main(String[] args)throws Exception  {
		Login l=new Login();
		
		l.checkPassword("swathiks");
	}
}