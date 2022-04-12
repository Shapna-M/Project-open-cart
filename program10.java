package batch2pack;
import java.util.Scanner;

public class program10 {
	static boolean Check(String s) {
	s=s.toUpperCase();
	for(int i=1;i<s.length();i++) {
		if(s.charAt(i)<s.charAt(i-1))
			return false;
	}
	return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the string:  ");
       str=sc.nextLine();
       program10 p=new program10();
       System.out.println(p.Check(str));
	}

}
