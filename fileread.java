package package3;
import java.io.FileInputStream;
import java.io.*;

import batch2pack.lab4program2;
import package2.filewriter;

public class fileread {

	public static void main(String[] args) throws Exception{
		File file = new File("C:\\Batch 1\\batch 2\\src\\batch2pack\\numbers.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		int st;
		while((st = br.readLine()) != -1 && st%2==0)
			{
				System.out.println(st);
			}
	}
}

			
			
			
		
	
