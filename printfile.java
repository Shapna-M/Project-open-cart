package batch2pack;
import java.io.*;

import java.util.Scanner;


public class printfile {

	public static void main(String[] args) throws IOException{
		File filename = new File("C:\\Users\\Administrator\\Desktop\\Sample.txt");
		FileInputStream inFile = new FileInputStream("C:\\Users\\Administrator\\Desktop\\Sample.txt");
		int fileLength = (int) filename.length();
		byte Bytes[] = new byte[fileLength];
		System.out.println("File size is: " + inFile.read(Bytes));
		
		String file1 = new String(Bytes);
		System.out.println("File content is:\n"+ file1);
		inFile.close();
	}

}
