package batch2pack;

public class class2 {
	String name;
	double bal;
	public class2(String n,double b) {
		name=n;
		bal=b;
	}
	public void show() {
		if(bal>0)
			System.out.println(name+"$"+bal);
		else
		     System.out.println(name+bal);
	}
}
