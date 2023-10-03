package exception;

import java.util.Scanner;

public class ThruExcep {
	public static void main(String[] args) throws AgeException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name:");
		String a=s.next();
		System.out.println("Enter age:");
		int b=s.nextInt();
		if(b>17) {
			System.out.println("welcome"); 
		}
		else {
			//System.out.println("Inelegible"); }
		throw new AgeException("Not eligible"); }
		System.out.println("Enter gender:");
		String c=s.next();
	}

}
