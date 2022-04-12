package batch2pack;

public class PersonDetail {
	String fname;
	String lname;
	int weight;
	int age;
	int phone;
	String gender;
	public PersonDetail(String fn,String ln,int w,int a,int ph) {
		fname=fn;
		lname=ln;
		weight=w;
		age=a;
		phone=ph;
		
	}
	public void show() {
		System.out.println("First name :" + fname + "\n" + "Last name :" + lname  +  "\n" +"weight :"+ weight +"\n" +"Age :" +  age + "\n" + "Phonenumber :" + phone + "\n" );
		
	}

}
