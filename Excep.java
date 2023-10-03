package exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Excep {
	public static void main(String[] args) throws IOException {
//		String name="mohan";
//		System.out.println(name.indexOf("s"));  //-1
		
		File f1=new File("C:\\Users\\Elitbook\\Desktop\\swathi.txt");
	FileReader fr=new FileReader(f1);
		int temp=0;
	while((temp=fr.read())!=-1) {
		System.out.println((char)(temp));
	}
		
	}

}
