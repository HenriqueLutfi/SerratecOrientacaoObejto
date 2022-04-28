package ExemploDatas;

import java.time.LocalDate;
import java.time.Period;

public class ExemploDiferencaDatas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		LocalDate dataAniversario = LocalDate.of(1975, 06, 14);
		System.out.println("dias da semana:" + hoje.getDayOfWeek().name());
		System.out.println("mes" + hoje.getMonthValue());
		System.out.println("ano"+hoje.getYear());
		
		Period periodo = Period.between(dataAniversario, hoje);
		System.out.println("passaram"+periodo.getYears()+"anos");
		System.out.println(periodo.getMonths()+"mes");
		System.out.println(periodo.getDays()+"dias");
		
	}

}
