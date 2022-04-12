package batch2pack;
import java.io.*;
import java.util.*;

public class lab4program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id=101;
		double sal=12000;
		String designation="Programmer";
		try {
			FileOutputStream fout=new FileOutputStream("employee.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(id);
			out.writeObject(sal);
			out.writeObject(designation);
			out.close();
			
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("employee.txt"));
			
		System.out.println("" + ois.readObject());
		System.out.println("" + ois.readObject());
		System.out.println("" + (String) ois.readObject());
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
