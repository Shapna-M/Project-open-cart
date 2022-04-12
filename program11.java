package batch2pack;
import java.util.*;
import java.time.*;
public class program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate nowdate=LocalDate.now();
		LocalDate date2=LocalDate.of(2011, 4, 2);
		Period p=Period.between(nowdate, date2);
		System.out.println("Year difference" +p.getYears());
		System.out.println("Month difference" +p.getMonths());
		System.out.println("date difference" +p.getDays());
	}

}
