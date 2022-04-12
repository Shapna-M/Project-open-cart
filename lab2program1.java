package batch2pack;

import java.util.Scanner;

class Person{
	String name;
	String age;
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
class Account extends Person{
	long accnum;
	double bal;
	public Account(int a,int b) {
		accnum=a;
		bal=b;
	}
	public void withdraw(int w) {
		bal=bal-w;
		System.out.println("After withdrawl the balance is : "+bal);
		
	}
	public void deposite(int d) {
		bal=bal+d;
		System.out.println("After desposit the balance amount is : "+bal);
	}
}
public class lab2program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter name:");
      String name = sc.nextLine();
      System.out.println("Enter age :");
      double age=sc.nextDouble();
      Account acc=new Account(879632679,40000);
      acc.withdraw(1000);
	}

}
