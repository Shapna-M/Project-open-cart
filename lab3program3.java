package batch2pack;
import java.util.Scanner;

public class lab3program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary");
		do {
			try {
				long salary=sc.nextLong();
				if(salary<3000) {
					throw new Exception("Salary cannot be less than 3000");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}while(sc.hasNextLong());

	}

}
