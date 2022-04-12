package batch2pack;
import java.time.LocalDate;
import java.time.Period;


public class program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1 = LocalDate.of(2022,3, 3);
		LocalDate date2 = LocalDate.of(2022,4, 3);
		System.out.println("Date 1 = " +date1);
		System.out.println("Date 2 = "+date2);
		Period p = Period.between(date1, date2);
		System.out.println("Periods = "+p);
		System.out.println("Years (Difference) = "+p.getYears());
		System.out.println("Month (Difference) = "+p.getMonths());
		System.out.println("Days (Difference) = "+p.getDays());

	}

}
