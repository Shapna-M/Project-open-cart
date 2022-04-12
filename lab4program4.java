package package2;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class lab4program4 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new FileReader("C:\\Batch 1\\batch 2\\src\\batch2pack\\numbers.txt"));
			sc.useDelimiter(",");
			while(sc.hasNextInt()) {
				int i=sc.nextInt();
				if(i%2==0) {
					System.out.println(i);
				}
			}
			System.out.println("Done");
		}catch(IOException e) {
			System.out.println("exception");
		}

	}

}
