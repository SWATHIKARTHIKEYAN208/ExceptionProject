package exception;

import java.util.Scanner;

public class Student implements Cloneable {
	int age;
	   String name;
	  
	   public void display() {
	      System.out.println("Name : "+name);
	      System.out.println("Age : "+age);
	   }

	   public static void main (String args[]) throws CloneNotSupportedException {
	     
	      
	      Student s = new Student();
	      Student s1 =  (Student)s.clone();
	      s1.age=26;
	      s1.name="swathi";
	      s1.display();
	   }
}
	   
	


