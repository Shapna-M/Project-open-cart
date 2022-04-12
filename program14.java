package batch2pack;
import java.util.Scanner;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the zone Id:    ");
		String id = sc.nextLine();
		ZonedDateTime currentTime = ZonedDateTime.now(ZoneId.of(id));
		System.out.println(id + ":" + currentTime);

	}

}
