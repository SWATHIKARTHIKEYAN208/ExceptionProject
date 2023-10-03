package exception;

import java.util.Scanner;

public class ThrusException  {
	public static void main(String[] args) throws AgeException {
		String a="Ram";
		int b=15;
		if(b>17) {
			System.out.println("welcome"); 
		}
		else {
			//System.out.println("Inelegible"); }
		throw new AgeException("Not eligible"); }
		String c="male";
		System.out.println(c);

}
}
