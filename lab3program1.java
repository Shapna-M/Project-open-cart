package batch2pack;
import java.util.Scanner;

public class lab3program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name: ");
		System.out.println("Enter last name:  ");
		do {
			try {
				String fn=sc.next();
				String ln=sc.next();
				if(fn!=null||fn.isEmpty() && ln!=null||ln.isBlank()) {
					throw new Exception("First and last name should not be blank");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}while(sc.hasNext());

	}

}
