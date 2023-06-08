
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Cidade {

	public static void main(String[] args) {
		
		HashMap<String,Integer> mapa = new HashMap<String,Integer>();
		Scanner sc = new Scanner(System.in);
		String cidade = "";
		
		do {
			System.out.println( "Digite o nome da cidade:" );
			cidade = sc.nextLine();
			if( ! cidade.isBlank() )
				mapa.put(cidade, cidade.length() );
		}
		while(! cidade.isBlank() );
		
		for(String x: mapa.keySet() )
			System.out.println(x + " - " + mapa.get(x) );
	}

}