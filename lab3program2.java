package batch2pack;
import java.util.Scanner;

public class lab3program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		do {
			try {
				int age=sc.nextInt();
				if(age<15) {
					throw new Exception("Age should be greater than 15");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}while(sc.hasNextInt());

	}

}
