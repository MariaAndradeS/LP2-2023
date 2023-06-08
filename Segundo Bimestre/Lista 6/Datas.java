
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class Datas {

	public static void main(String[] args) {
		
		HashMap<LocalDate,String> mapa = new HashMap<LocalDate,String>();
		Scanner sc = new Scanner(System.in);
		Integer dia; Integer mes; Integer ano;
		
		do {
			
			System.out.println("Digite o dia: ");
			dia = sc.nextInt();
			System.out.println("Digite o mes: ");
			mes = sc.nextInt();
			System.out.println("Digite o ano: ");
			ano = sc.nextInt();
			
			if(  dia > 0 && mes > 0 && ano > 0 ) {
				LocalDate data = LocalDate.of(ano, mes, dia);
				mapa.put( data, data.getDayOfWeek().name() );
			}
			
		}
		while( dia > 0 && mes > 0 && ano > 0 );

		for( LocalDate d: mapa.keySet() )
			System.out.println( d + " - " + mapa.get(d) );
	}

}