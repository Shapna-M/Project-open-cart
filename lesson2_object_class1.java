package batch2pack;

public class lesson2_object_class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box ba;
		ba=new Box();
		ba.calvolume();

	}

}
class Box
{
	double dbw=10;
	double dbh=10;
	double dbd=10;
	
	double calvolume()
	{
		System.out.println(dbw*dbh*dbd);
		return dbw*dbh*dbd;
	}
}