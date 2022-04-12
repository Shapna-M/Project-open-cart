package batch2pack;
import java.io.*;
import java.util.*;

public class lab4program2a {

	public static void main(String[] args) throws Exception {
		File fileOne = new File("C:\\Batch 1\\batch 2\\src\\batch2pack\\numbers.txt");
		PrintWriter writer=new PrintWriter(new FileWriter("C:\\Batch 1\\batch 2\\src\\batch2pack\\numbers.txt"));
		for(int i=0;i<=10;i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		

	}

}
