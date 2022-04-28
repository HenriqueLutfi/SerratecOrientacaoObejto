package ExemploDatas;

import java.time.LocalDate;

public class ExemploLocalDate {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		System.out.println(LocalDate.of(2022, 04, 22));
		
		//parse recebe a data como String
		System.out.println(LocalDate.parse("2020-04-22"));
		System.out.println(hoje.plusDays(10));
		System.out.println(hoje.minusYears(10));
		System.out.println(hoje.isLeapYear());
	}

}
