
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Aleatorios {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		Random random = new Random();
		
		do {
			lista.add( random.nextInt(1, 100));
		}
		while( lista.size() < 10 );
		
		Integer maior = Collections.max(lista);
		
		Integer menor = Collections.min(lista);
		
		System.out.println("Maior valor: " + maior );
		
		System.out.println("Menor valor: " + menor );
	}

}