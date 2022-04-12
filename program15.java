package batch2pack;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class program15 {
	String fname;
	String lname;
	
	static void getFullName(String fname, String lname)
	{
		System.out.println(fname + " " + lname);sj
	}
	static void calculateAge(String dob)
	{
		LocalDate date = LocalDate.parse(dob);
		LocalDate now = LocalDate.now();
		Period p = Period.between(date, now);
		System.out.println("Your age is " + p.getYears() + "years ,"  + p.getMonths() + "months ,"  + p.getDate() + "date,");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		program15 obj=new program15();
		System.out.print("Enter your first name:  ");
		obj.fname = sc.nextLine();
		System.out.print("Enter your last name :  ");
		obj.lname = sc.nextLine();
		
		System.out.print("Enter the dob in format 'yyyy-mm-dd:  ");
		String dob = sc.nextLine();
		obj.getFullName(obj.fname,obj.lname);

	}

}
