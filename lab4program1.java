package batch2pack;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class lab4program1 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			FileReader fr = new FileReader("C:\\Batch 1\\batch 2\\src\\batch2pack\\p1.txt");
			FileWriter fw = new FileWriter("C:\\Batch 1\\batch 2\\src\\batch2pack\\p1.txt");
			String str="";
			String rev="";
			char ch;
			int i;
			while((i=fr.read())!=-1) {
				str+=(char)i;
			}
			System.out.println(str);
			for(i=0;i<str.length();i++) {
				ch=str.charAt(i);
				rev=ch+rev;
			}
			System.out.println(rev);
			  fw.write(rev);
			  fr.close();
			  fw.close();
			  System.out.println("Done");
		}catch(IOException e) {
				System.out.println("exception");
			}

	}

}
