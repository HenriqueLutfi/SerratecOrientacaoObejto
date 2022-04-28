package ExemploDatas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo1Data {
	public static void main(String[] args) {
		Date dataDeHoje = new Date();
		System.out.println(dataDeHoje);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyy");
		String dataComFormato = sdf.format(dataDeHoje);
		System.out.println(dataComFormato);
	}
}
