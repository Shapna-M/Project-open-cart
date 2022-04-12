package batch2pack;

import java.time.Period;
import java.util.Scanner;

public class program13 {
	static void getDuration(String date,int y,int m)
	{
		LocalDate purchaseDate = LocalDate.parse(date);
		
		Period p1 = Period.ofYears(y);
		Temporal temp1 = p1.addTo(purchaseDate);
		Period p2 = Period.ofMonths(m);
		Temporal temp2=p2.addTo(temp1);
		System.out.print("The waranty period is till:   " + temp2);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the date in format 'yyyy-mm-dd':  ");
		String date1 = sc.nextLine();
		System.out.print("Enter the no. of years in waranty period : ");
		int yr = sc.nextInt();
		System.out.print("Enter the date in format 'yyyy-mm-dd':  ");
		int mon= sc.nextInt();
		program13 obj = new program13();
		obj.getDuration(date1, yr, mon);
		

	}

}
