package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutput {
public static void main(String[] args) {
	
	
	try {
		FileOutputStream f1=new FileOutputStream("anu.txt");
		String s1="mamatha manchala";
		
		byte b1[] =s1.getBytes();
		
		f1.write(b1);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
}
}
