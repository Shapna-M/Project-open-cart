package package2;
import java.io.FileOutputStream;

import batch2pack.lab4program2;

public class filewriter {

	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("C:\\Batch 1\\batch 2\\src\\batch2pack\\numbers.txt");
			int i;
			for(i=0;i<10;i++) {
				fout.write(i);
			}
			fout.close();
			System.out.println("Success");
		}catch(Exception e) {System.out.println(e);

	}

}
}
