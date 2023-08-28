package exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FilNot {
	public static void main(String[] args) throws IOException {
		
		File var=new File("C:\\Users\\HARI\\Documents\\cci.txt");
		
		FileReader fr=new FileReader(var);
		int temp=0;
		while((temp=fr.read()) != -1) {
			
			System.out.print((char)(temp));
		}
		
		
		
		
	}

}
