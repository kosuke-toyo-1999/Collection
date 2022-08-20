package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {
	
	public Task()  {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate d1 = LocalDate.parse("2021-10-21", f);
		LocalDate d2 = LocalDate.parse("2021-9-15", f);
		LocalDate d3 = LocalDate.parse("2021-12-4", f);
		LocalDate d4 = LocalDate.parse("2021-8-10", f);
		LocalDate d5 = LocalDate.parse("2021-11-9", f);
		

		
	}
	
	

}
